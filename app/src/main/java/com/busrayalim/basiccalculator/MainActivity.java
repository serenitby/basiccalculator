package com.busrayalim.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1  = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        resultText = findViewById(R.id.resultText);
    }

    public void toplama(View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches(""))
        {
            resultText.setText("Enter number!!");
        }else {
            int firstnumber = Integer.parseInt(number1.getText().toString());
            int secondnumber = Integer.parseInt(number2.getText().toString());
            int result = firstnumber + secondnumber;
            resultText.setText("result: "+ result);
        }

    }
    public void cikarma(View view){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches(""))
        {

            resultText.setText("Enter number!!");
        }else {
            int firstnumber = Integer.parseInt(number1.getText().toString());
            int secondnumber = Integer.parseInt(number2.getText().toString());
            int result = firstnumber - secondnumber;
            resultText.setText("result: "+ result);
        }
    }
    public void carpma(View view){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches(""))
        {

            resultText.setText("Enter number!!");
        }else {
            int firstnumber = Integer.parseInt(number1.getText().toString());
            int secondnumber = Integer.parseInt(number2.getText().toString());
            int result = firstnumber * secondnumber;
            resultText.setText("result: "+ result);
        }
    }
    public void bolme(View view){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches(""))
        {

            resultText.setText("Enter number!!");
        }else {
            int firstnumber = Integer.parseInt(number1.getText().toString());
            int secondnumber = Integer.parseInt(number2.getText().toString());
            int result = firstnumber / secondnumber;
            resultText.setText("result: "+ result);
        }
    }
}