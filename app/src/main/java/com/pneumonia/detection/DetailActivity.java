package com.pneumonia.detection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView1, imageView2;
    TextView textView1, textView2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView1 = findViewById(R.id.img_back);
        imageView2 = findViewById(R.id.imageView);
        textView1 = findViewById(R.id.tv_title);
        textView2 = findViewById(R.id.tv_desc);
        button = findViewById(R.id.button);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
//                startActivity(intent);
                finish();
            }
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle!= null)
        {
            int image = bundle.getInt("Image");
            imageView2.setImageResource(image);

            String title = bundle.getString("Title");
            textView1.setText(title);

            String desc = bundle.getString("Desc");
            textView2.setText(desc);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, DataActivity.class);
                startActivity(intent);
            }
        });
    }
}