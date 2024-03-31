package com.example.domashka2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

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
    char randomLetter;
    ArrayList<Character> letters = new ArrayList<>();
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        letters.add('X');
        letters.add('O');

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
            int randomIndex = random.nextInt(letters.size());
            randomLetter = letters.get(randomIndex);
            System.out.println("Случайная буква1: " + randomLetter);
            button.setText(Character.toString(randomLetter));
        });
        button1.setOnClickListener(view -> {
            int randomIndex = random.nextInt(letters.size());
            randomLetter = letters.get(randomIndex);
            System.out.println("Случайная буква2: " + randomLetter);
            button1.setText(Character.toString(randomLetter));
        });
        button2.setOnClickListener(view -> {
            int randomIndex = random.nextInt(letters.size());
            randomLetter = letters.get(randomIndex);
            System.out.println("Случайная буква2: " + randomLetter);
            button2.setText(Character.toString(randomLetter));
        });
        button3.setOnClickListener(view -> {
            int randomIndex = random.nextInt(letters.size());
            randomLetter = letters.get(randomIndex);
            System.out.println("Случайная буква2: " + randomLetter);
            button3.setText(Character.toString(randomLetter));
        });
        button4.setOnClickListener(view -> {
            int randomIndex = random.nextInt(letters.size());
            randomLetter = letters.get(randomIndex);
            System.out.println("Случайная буква2: " + randomLetter);
            button4.setText(Character.toString(randomLetter));
        });
        button5.setOnClickListener(view -> {
            int randomIndex = random.nextInt(letters.size());
            randomLetter = letters.get(randomIndex);
            System.out.println("Случайная буква2: " + randomLetter);
            button5.setText(Character.toString(randomLetter));
        });
        button6.setOnClickListener(view -> {
            int randomIndex = random.nextInt(letters.size());
            randomLetter = letters.get(randomIndex);
            System.out.println("Случайная буква2: " + randomLetter);
            button6.setText(Character.toString(randomLetter));
        });
        button7.setOnClickListener(view -> {
            int randomIndex = random.nextInt(letters.size());
            randomLetter = letters.get(randomIndex);
            System.out.println("Случайная буква2: " + randomLetter);
            button7.setText(Character.toString(randomLetter));
        });
        button8.setOnClickListener(view -> {
            int randomIndex = random.nextInt(letters.size());
            randomLetter = letters.get(randomIndex);
            System.out.println("Случайная буква2: " + randomLetter);
            button8.setText(Character.toString(randomLetter));
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