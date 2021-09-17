package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView studentsText;
    private Button registerBtn;
    private String listStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        studentsText=findViewById(R.id.studentsText);
        registerBtn= findViewById(R.id.registerBtn);

        listStudent="";

       cargarDatos();


        registerBtn.setOnClickListener((view) -> {
                Intent notaIntent = new Intent(this, RegistroActivity.class);
                startActivityForResult(notaIntent,20);
              //  finish();
        });

    }

    private void cargarDatos() {


            SharedPreferences preferences = getSharedPreferences
                    ("datos de estudiantes", Context.MODE_PRIVATE);

            String user = preferences.getString("user", "no hay registros");      //dato clave a guardar
            studentsText.setText(user);
           listStudent+= user + "\n";
            // studentsText.setText(listStudent);


    }


}