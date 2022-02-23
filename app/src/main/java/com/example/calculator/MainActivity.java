package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button sum;
    Button sub;
    Button multi;
    Button div;
    TextView txt;
    EditText edit1;
    EditText edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.division);
        txt = findViewById(R.id.txt);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Integer.parseInt(edit1.getText().toString());
                double num2 = Integer.parseInt(edit2.getText().toString());

                double sum = num1 + num2;

                txt.setText(String.valueOf(sum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Integer.parseInt(edit1.getText().toString());
                double num2 = Integer.parseInt(edit2.getText().toString());

                double sub = num1 - num2;


                txt.setText(String.valueOf(sub));
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Integer.parseInt(edit1.getText().toString());
                double num2 = Integer.parseInt(edit2.getText().toString());

                double multi = num1 * num2;

                txt.setText(String.valueOf(multi));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Integer.parseInt(edit1.getText().toString());
                double num2 = Integer.parseInt(edit2.getText().toString());

                double div = num1  /num2 ;

                txt.setText(String.valueOf(div));
            }
        });

    }
}