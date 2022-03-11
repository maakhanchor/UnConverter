package com.example.unconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import java.math.RoundingMode;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textview;
    private EditText edittext;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textview = findViewById(R.id.textView);
        edittext = findViewById(R.id.editTextNumberDecimal);

    }

    public void convert (View view){
        String s1 = edittext.getText().toString();
        int kg = Integer.parseInt(s1);
        double pound = kg*2.205;


        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.UP);

        textview.setText("Pound :    " + df.format(pound) );

    }

}