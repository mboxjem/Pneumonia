package com.pneumonia.detection;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class ResultActivity extends AppCompatActivity {

    TextView textView1, textView2;
    LottieAnimationView lottieAnimationView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textView1 = findViewById(R.id.tv_title);
        textView2 = findViewById(R.id.tv_desc);
        lottieAnimationView = findViewById(R.id.lottie_result);
        button = findViewById(R.id.button);

        Bundle bundle = getIntent().getExtras();
        if (bundle!= null)
        {
            String title = bundle.getString("textView1");
            textView1.setText(title);

            String desc = bundle.getString("textView2");
            textView2.setText(desc);

            int lottie = bundle.getInt("lottie");
            lottieAnimationView.setAnimation(lottie);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(ResultActivity.this, QuestActivity.class);
//                startActivity(intent);
//                finish();
                finish();
            }
        });
    }

//    @Override
//    public void onBackPressed() {
//        Intent intent = new Intent(ResultActivity.this, DataActivity.class);
//        startActivity(intent);
//    }
}