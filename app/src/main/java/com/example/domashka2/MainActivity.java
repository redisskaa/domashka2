package com.example.domashka2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonX);
        button1 = findViewById(R.id.buttonO);
        button2 = findViewById(R.id.button1_X);
        button3 = findViewById(R.id.button2_X);
        button4 = findViewById(R.id.button3_X);
        button5 = findViewById(R.id.button1_0);
        button6 = findViewById(R.id.button2_0);
        button7 = findViewById(R.id.button3_0);
        button8 = findViewById(R.id.button4_0);
        buttonClear = findViewById(R.id.buttonClear);

        button.setOnClickListener(view -> {
            button.setText("X");
        });
        button1.setOnClickListener(view -> {
            button1.setText("O");
        });
        button2.setOnClickListener(view -> {
            button2.setText("X");
        });
        button3.setOnClickListener(view -> {
            button3.setText("O");
        });
        button4.setOnClickListener(view -> {
            button4.setText("X");
        });
        button5.setOnClickListener(view -> {
            button5.setText("O");
        });
        button6.setOnClickListener(view -> {
            button6.setText("X");
        });
        button7.setOnClickListener(view -> {
            button7.setText("O");
        });
        button8.setOnClickListener(view -> {
            button8.setText("O");
        });
        buttonClear.setOnClickListener(view -> {
            button.setText("");
            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
        });
    }


}