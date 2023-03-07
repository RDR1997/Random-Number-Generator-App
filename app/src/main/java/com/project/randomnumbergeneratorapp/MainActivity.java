package com.project.randomnumbergeneratorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.generate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editTextRange);
                TextView textView = (TextView) findViewById(R.id.displayNumber);

                int range = Integer.parseInt(editText.getText().toString());
                Random ran = new Random();
                int rand_no = ran.nextInt(range-0) + 0;

                textView.setText(rand_no + " ");
            }
        });
    }
}