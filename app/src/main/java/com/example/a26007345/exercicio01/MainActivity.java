package com.example.a26007345.exercicio01;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText altura;
    private RadioGroup sexo;
    private  double resul;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        altura = findViewById(R.id.inpaltura);
        sexo = findViewById(R.id.radiosexo);
        text = findViewById(R.id.text1);
    }

    public void calcularPesoIdeal(View v1){
        int idOpcaEscolhida = sexo.getCheckedRadioButtonId();
        if(idOpcaEscolhida == R.id.radioButtonM){
            resul = 72.7 * (Double.parseDouble(altura.getText().toString()));
        }else{
            resul = 62.1 * (Double.parseDouble(altura.getText().toString()));
        }
        text.setText("Seu peso ideal é: " + resul + "kg");

    }
}
