package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.Preference;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    private EditText nameEdiText;
    private EditText codeEdiText;
    private Button continue1Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nameEdiText=findViewById(R.id.nameEdiText);
        codeEdiText=findViewById(R.id.codeEdiText);
        continue1Btn=findViewById(R.id.continue1Btn);
      //  continue1Btn.setEnabled(true);



       /* nameEdiText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.toString().equals("")){
                    continue1Btn.setEnabled(false);
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
              //  verificarDatos();
            }
        });
*/

        continue1Btn.setOnClickListener((view) -> {
            guardarDatos();
            Intent intent=new Intent(this,PreparationActivity.class);
            startActivityForResult(intent,20);
            guardarDatos();


        });
    }

    private void guardarDatos() {
        SharedPreferences preferences= getSharedPreferences
                ("datos de estudiantes", Context.MODE_PRIVATE);

        String usuario=nameEdiText.getText().toString();    //obtenemos la informacion que ingresamos en el formulario
        String pass=codeEdiText.getText().toString();

        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("user",usuario);
        editor.putString("pass",pass);

        nameEdiText.setText(usuario);
        codeEdiText.setText(pass);
        editor.commit();
       // Toast.makeText(this,"el estudiante ha sido registrado",Toast.LENGTH_SHORT).show();
    }



}