package com.pneumonia.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class QuestActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3;
    ListView listView;
    ImageView imageView;
    SparseBooleanArray sparseBooleanArray;
    Button button;
    Intent intent;

    String[] data = {"Mengalami batuk", "Mengalami Kejang, tidak mau minum ASI, kesadaran menurun, demam", "Mengalami sesak napas", "Sering minum ASI", "Tidur mendengkur", "BAB cair", "Mengalami pilek"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);

        textView1 = findViewById(R.id.name_parents);
        textView2 = findViewById(R.id.name_child);
        textView3 = findViewById(R.id.date_child);
        listView = findViewById(R.id.listView);
        imageView = findViewById(R.id.img_back);
        button = findViewById(R.id.button);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestActivity.this, DataActivity.class);
                startActivity(intent);
            }
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle!= null)
        {
            String name_parents = bundle.getString("editText1");
            textView1.setText(name_parents);

            String name_child = bundle.getString("editText2");
            textView2.setText(name_child);

            String date_child = bundle.getString("editText3");
            textView3.setText(date_child);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(QuestActivity.this, android.R.layout.simple_list_item_multiple_choice, android.R.id.text1, data );
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sparseBooleanArray = listView.getCheckedItemPositions().size();

                if(sparseBooleanArray>3)
                    problem();
                    //startActivity(intent = new Intent(QuestActivity.this, ResultActivity.class));
                    //Toast.makeText(QuestActivity.this, "Problem Values = " + sparseBooleanArray, Toast.LENGTH_LONG).show();
                else
                    safe();
                    //Toast.makeText(QuestActivity.this, "Safe Values = " + sparseBooleanArray, Toast.LENGTH_LONG).show();
            }

        });
    }

    private void problem() {
        Intent intent = new Intent(QuestActivity.this, ResultActivity.class);
        intent.putExtra("lottie", R.raw.js1);
        intent.putExtra("textView1", "Anak Anda Berisiko Pneumonia");
        intent.putExtra("textView2", "Segera Konsultasi Ke Puskesmas/Rumah Sakit Teredekat");
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    private void safe() {
        Intent intent = new Intent(QuestActivity.this, ResultActivity.class);
        intent.putExtra("lottie", R.raw.js2);
        intent.putExtra("textView1", "Anak Anda Tidak Berisiko Pneumonia");
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}