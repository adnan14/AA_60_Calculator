package com.example.crypto.aa_60_calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class CalculatorActivity extends ActionBarActivity {
    private EditText input1;
    private EditText input2;
    private EditText input3;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.editText1);
        input2 = (EditText) findViewById(R.id.editText2);
        input3 = (EditText) findViewById(R.id.editText3);

        Button resistButton = (Button) findViewById(R.id.button1);
        resistButton.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                double result = new Double(input2.getText().toString())
                        / new Double(input3.getText().toString());
                input1.setText(Double.toString(result));
            }
        });

        Button voltageButton = (Button) findViewById(R.id.button2);
        voltageButton.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                double result = new Double(input1.getText().toString())
                        * new Double(input3.getText().toString());
                input2.setText(Double.toString(result));
            }
        });

        Button currentButton = (Button) findViewById(R.id.button3);
        currentButton.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                double result = new Double(input2.getText().toString())
                        / new Double(input1.getText().toString());
                input3.setText(Double.toString(result));
            }
        });
    }
}