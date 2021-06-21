package com.pneumonia.detection;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DataActivity extends AppCompatActivity {

    Calendar calendar = Calendar.getInstance();
    EditText editText1, editText2, editText3, editText4, editText5;
    ImageView imageView;
    Spinner spinner;
    Button button;

    String[] data = {"SD", "SMP", "SMA", "Diploma", "Sarjana", "Master", "Doktoral"};

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        imageView = findViewById(R.id.img_back);
        editText1 = findViewById(R.id.name_parents);
        editText2 = findViewById(R.id.name_child);
        editText3 = findViewById(R.id.date_child);
        editText4 = findViewById(R.id.job);
        editText5 = findViewById(R.id.address);
        spinner = findViewById(R.id.education_parent);
        button = findViewById(R.id.button);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(DataActivity.this, MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });

        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, monthOfYear);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }
        };

        /*editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(DataActivity.this, date, calendar
                        .get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        }); */

        editText3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                final int DRAWABLE_RIGHT = 2;

                if(motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if(motionEvent.getRawX() >= (editText3.getRight() - editText3.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {
                        new DatePickerDialog(DataActivity.this, date, calendar
                                .get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                                calendar.get(Calendar.DAY_OF_MONTH)).show();
                        return true;
                    }
                }
                return false;
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_list, data);
        adapter.setDropDownViewResource(R.layout.activity_spinner);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().isEmpty() || editText2.getText().toString().isEmpty() || editText3.getText().toString().isEmpty() || spinner.getAdapter().toString().isEmpty()
                        || editText4.getText().toString().isEmpty() || editText5.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Masukkan Data", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(DataActivity.this, QuestActivity.class);
                    intent.putExtra("editText1", editText1.getText().toString());
                    intent.putExtra("editText2", editText2.getText().toString());
                    intent.putExtra("editText3", editText3.getText().toString());
                    intent.putExtra("spinner", spinner.getAdapter().toString());
                    intent.putExtra("editText4", editText4.getText().toString());
                    intent.putExtra("editText5", editText5.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    private void updateLabel() {

        String myFormat = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        editText3.setText(sdf.format(calendar.getTime()));
    }
}