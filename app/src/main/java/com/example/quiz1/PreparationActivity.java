package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class PreparationActivity extends AppCompatActivity {
    private CheckBox boxA;
    private CheckBox boxB;
    private CheckBox boxC;
    private Button continue2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparation);

        boxA=findViewById(R.id.boxA);
        boxB=findViewById(R.id.boxB);
        boxC=findViewById(R.id.boxC);
        continue2Btn=findViewById(R.id.continue2Btn);

        continue2Btn.setOnClickListener((view) -> {
            Intent notaIntent = new Intent(this, AutoevaluationActivity.class);
            startActivity(notaIntent);
            finish();



        });

    }


}