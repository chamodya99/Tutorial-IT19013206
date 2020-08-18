package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText num01;
    EditText num02;

    String number1;
    String number2;

    TextView lblsum;

    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        num01=findViewById(R.id.num01);
        num02=findViewById(R.id.num02);
        lblsum=findViewById(R.id.lblsum);

        Intent intent = getIntent();

        String s = null;
        String number1 = intent.getStringExtra(s);
        String number2 = intent.getStringExtra(s);

        num01.setText(number1);
        num02.setText(number2);

        n1=Integer.parseInt(number1);
        n2=Integer.parseInt(number2);
    }

    public void add(View view) {
        lblsum.setText(number1 + "+"+number2 + "=" + (n1+n2));

    }
    public void substract(View view) {
        lblsum.setText(number1 + "-"+number2 + "=" + (n1-n2));

    }
    public void multiply(View view) {
        lblsum.setText(number1 + "x"+number2 + "=" + (n1*n2));

    }
    public void devide(View view) {
        lblsum.setText(number1 + "/"+number2 + "=" + (n1/n2));

    }
}