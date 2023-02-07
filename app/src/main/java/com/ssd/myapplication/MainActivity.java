package com.ssd.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Variables
    Button btnCalcular;
    TextView lblResultado;
    EditText txtN1, txtN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting de objetos
        btnCalcular = (Button) findViewById(R.id.btncalcular);
        btnCalcular.setOnClickListener(this);
        lblResultado = (TextView) findViewById(R.id.lblresultado);
        txtN1 = (EditText) findViewById(R.id.txtn1);
        txtN2 = (EditText) findViewById(R.id.txtn2);

    }

    @Override
    public void onClick(View view) {
        int n1 = Integer.parseInt(txtN1.getText().toString());
        int n2 = Integer.parseInt(txtN2.getText().toString());

        //Proceso
        int suma = n1 + n2;
        int resta = n1 - n2;
        int multi = n1 * n2;
        float divi = (n2 == 0) ? 0 : n1 / n2;

        //Salida
        lblResultado.setText("Los resultados son: \n\n" + "Suma:" + suma + "\nResta:" + resta + "\nMultiplicacion:" + multi + "\nDivision:" + divi);

    }
}

