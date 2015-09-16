package com.example.vanessa.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorLayout extends Activity {
    Button bot1;
    Button bot2;
    Button bot3;
    Button bot4;
    Button bot5;
    Button bot6;
    Button bot7;
    Button bot8;
    Button bot9;
    Button bot0;
    Button botMais;
    Button botMenos;
    Button botMult;
    Button botDiv;
    Button botIgual;
    Button botC;
    TextView acc;
    private String valor;
    private String op1;
    private int operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_layout);

        bot0 = (Button) findViewById(R.id.button0);
        bot1 = (Button) findViewById(R.id.button1);
        bot2 = (Button) findViewById(R.id.button2);
        bot3 = (Button) findViewById(R.id.button3);
        bot4 = (Button) findViewById(R.id.button4);
        bot5 = (Button) findViewById(R.id.button5);
        bot6 = (Button) findViewById(R.id.button6);
        bot7 = (Button) findViewById(R.id.button7);
        bot8 = (Button) findViewById(R.id.button8);
        bot9 = (Button) findViewById(R.id.button9);
        botMais = (Button) findViewById(R.id.buttonMais);
        botMenos = (Button) findViewById(R.id.buttonMenos);
        botMult = (Button) findViewById(R.id.buttonMul);
        botDiv = (Button) findViewById(R.id.buttonDiv);
        botIgual = (Button) findViewById(R.id.buttonIgual);
        botC = (Button) findViewById(R.id.buttonC);
        this.acc = (TextView) findViewById(R.id.acc);
        bot0.setOnClickListener(button0);
        bot1.setOnClickListener(button1);
        bot2.setOnClickListener(button2);
        bot3.setOnClickListener(button3);
        bot4.setOnClickListener(button4);
        bot5.setOnClickListener(button5);
        bot6.setOnClickListener(button6);
        bot7.setOnClickListener(button7);
        bot8.setOnClickListener(button8);
        bot9.setOnClickListener(button9);
        botMais.setOnClickListener(buttonMais);
        botMenos.setOnClickListener(buttonMenos);
        botMult.setOnClickListener(buttonMult);
        botDiv.setOnClickListener(buttonDiv);
        botIgual.setOnClickListener(buttonIgual);
        botC.setOnClickListener(buttonC);
    }

    View.OnClickListener button0 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                valor = valor +  String.valueOf(0);
                acc.setText(valor);
            }else{
                valor = String.valueOf(0);
                acc.setText(valor);
            }
        }
    };
    View.OnClickListener button1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                valor = valor +  String.valueOf(1);
                acc.setText(valor);
            }else{
                valor = String.valueOf(1);
                acc.setText(valor);
            }
        }
    };

    View.OnClickListener button2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                valor = valor +  String.valueOf(2);
                acc.setText(valor);
            }else{
                valor = String.valueOf(2);
                acc.setText(valor);
            }
        }
    };
    View.OnClickListener button3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                valor = valor +  String.valueOf(3);
                acc.setText(valor);
            }else{
                valor = String.valueOf(3);
                acc.setText(valor);
            }
        }
    };
    View.OnClickListener button4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                valor = valor +  String.valueOf(4);
                acc.setText(valor);
            }else{
                valor = String.valueOf(4);
                acc.setText(valor);
            }
        }
    };
    View.OnClickListener button5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                valor = valor +  String.valueOf(5);
                acc.setText(valor);
            }else{
                valor = String.valueOf(5);
                acc.setText(valor);
            }
        }
    };
    View.OnClickListener button6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                valor = valor +  String.valueOf(6);
                acc.setText(valor);
            }else{
                valor = String.valueOf(6);
                acc.setText(valor);
            }
        }
    };
    View.OnClickListener button7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                valor = valor +  String.valueOf(7);
                acc.setText(valor);
            }else{
                valor = String.valueOf(7);
                acc.setText(valor);
            }
        }
    };
    View.OnClickListener button8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                valor = valor +  String.valueOf(8);
                acc.setText(valor);
            }else{
                valor = String.valueOf(8);
                acc.setText(valor);
            }
        }
    };
    View.OnClickListener button9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                valor = valor +  String.valueOf(9);
                acc.setText(valor);
            }else{
                valor = String.valueOf(9);
                acc.setText(valor);
            }
        }
    };
    View.OnClickListener buttonMais = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                op1 = valor;
                valor = null;
                acc.setText("");
                operacao = 1;
            }
        }
    };
    View.OnClickListener buttonMenos = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                op1 = valor;
                valor = null;
                acc.setText("");
                operacao = 2;
            }
        }
    };
    View.OnClickListener buttonMult = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                op1 = valor;
                valor = null;
                acc.setText("");
                operacao = 3;
            }
        }
    };
    View.OnClickListener buttonDiv = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                op1 = valor;
                valor = null;
                acc.setText("");
                operacao = 4;
            }
        }
    };
    View.OnClickListener buttonIgual = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(valor != null){
                if(operacao == 2){
                    int result = Integer.parseInt(op1) - Integer.parseInt(valor);
                    acc.setText(String.valueOf(result));
                }else if(operacao == 3){
                    int result = Integer.parseInt(op1) * Integer.parseInt(valor);
                    acc.setText(String.valueOf(result));
                }else if(operacao == 4) {
                    int result = Integer.parseInt(op1) / Integer.parseInt(valor);
                    acc.setText(String.valueOf(result));
                }else{
                    int result = Integer.parseInt(op1) + Integer.parseInt(valor);
                    acc.setText(String.valueOf(result));
                }
            }
        }
    };
    View.OnClickListener buttonC = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            valor = null;
            acc.setText("");
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
