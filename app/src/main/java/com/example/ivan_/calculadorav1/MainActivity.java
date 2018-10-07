package com.example.ivan_.calculadorav1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnSuma, btnResta, btnResultado, btnBorrar;
    TextView edtResultado;
    int resultado;
    String operador, mostrar, reserva, sumatoria;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtResultado = (TextView) findViewById(R.id.edtResultado);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtResultado.getText().toString().compareTo("0"))==0){
                    edtResultado.setText("1");
                }else{
                    edtResultado.setText(edtResultado.getText()+"1");
                }
            }
        });

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtResultado.getText().toString().compareTo("0"))==0){
                    edtResultado.setText("2");
                }else{
                    edtResultado.setText(edtResultado.getText()+"2");
                }
            }
        });
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtResultado.getText().toString().compareTo("0"))==0){
                    edtResultado.setText("3");
                }else{
                    edtResultado.setText(edtResultado.getText()+"3");
                }
            }
        });
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtResultado.getText().toString().compareTo("0"))==0){
                    edtResultado.setText("4");
                }else{
                    edtResultado.setText(edtResultado.getText()+"4");
                }
            }
        });
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtResultado.getText().toString().compareTo("0"))==0){
                    edtResultado.setText("5");
                }else{
                    edtResultado.setText(edtResultado.getText()+"5");
                }
            }
        });
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtResultado.getText().toString().compareTo("0"))==0){
                    edtResultado.setText("6");
                }else{
                    edtResultado.setText(edtResultado.getText()+"6");
                }
            }
        });
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtResultado.getText().toString().compareTo("0"))==0){
                    edtResultado.setText("8");
                }else{
                    edtResultado.setText(edtResultado.getText()+"8");
                }
            }
        });
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtResultado.getText().toString().compareTo("0"))==0){
                    edtResultado.setText("9");
                }else{
                    edtResultado.setText(edtResultado.getText()+"9");
                }
            }
        });
        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((edtResultado.getText().toString().compareTo("0"))==0){
                    edtResultado.setText("0");
                }else{
                    edtResultado.setText(edtResultado.getText()+"0");
                }
            }
        });
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtResultado.setText("0");
            }
        });
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = edtResultado.getText().toString();
                operador = "+";
                edtResultado.setText("");
            }
        });
        btnResta = (Button) findViewById(R.id.btnResta);
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva = edtResultado.getText().toString();
                operador = "-";
                edtResultado.setText("");
            }
        });
        btnResultado = (Button) findViewById(R.id.btnIgual);
        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = edtResultado.getText().toString();
                mostrar = mostrar + "1";

                if(operador.equals("+")){
                    resultado = Integer.parseInt(reserva) + Integer.parseInt(edtResultado.getText().toString());
                    edtResultado.setText(String.valueOf(resultado));
                }
                if (operador.equals("-")){
                    resultado = Integer.parseInt(reserva) - Integer.parseInt((edtResultado.getText().toString()));
                    edtResultado.setText(String.valueOf(resultado));
                }

            }
        });
    }
}
