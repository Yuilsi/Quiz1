package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class AutoevaluationActivity extends AppCompatActivity {

    private CheckBox box1;
    private CheckBox box2;
    private CheckBox box3;
    private Button finishBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autoevaluation);

        box1=findViewById(R.id.box1);
        box2=findViewById(R.id.box2);
        box3=findViewById(R.id.box3);
        finishBtn=findViewById(R.id.finishBtn);


        finishBtn.setOnClickListener((view) -> {
           Intent notaIntent = new Intent(this, MainActivity.class);
          startActivity(notaIntent);
          finish();
        });
        
    }


}