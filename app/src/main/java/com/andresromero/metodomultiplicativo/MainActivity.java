package com.andresromero.metodomultiplicativo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a,m,xn, aux ;
    String resultado;
    EditText texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=0;
        m=0;
        xn=0;
        aux=0;
        resultado = "";
    }

    public void mostrar(View vista){


        texto = (EditText)findViewById(R.id.setA);
        a = Integer.parseInt(texto.getText().toString());
        texto = (EditText)findViewById(R.id.setM);
        m = Integer.parseInt(texto.getText().toString());
        texto = (EditText)findViewById(R.id.setXn);
        xn = Integer.parseInt(texto.getText().toString());
        texto = (EditText)findViewById(R.id.cantidad);
        aux = Integer.parseInt(texto.getText().toString());

        for (int i = 0; i < aux; i++) {
            xn = (xn+a) %m;

            resultado = (resultado + "\nX"+i+" = " + xn);

        }
        TextView respuesta = (TextView) findViewById(R.id.resultado);
    respuesta.setText(resultado);
    }

}
