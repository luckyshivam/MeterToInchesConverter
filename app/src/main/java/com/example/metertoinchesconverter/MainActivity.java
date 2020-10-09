package com.example.metertoinchesconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 1m = 39.37 inches

    private TextView resultTextview;
    private Button convertButton;
    private EditText enterMeters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeters = (EditText) findViewById(R.id.metersEditText);
        convertButton = (Button) findViewById(R.id.ConvertButtonID);
        resultTextview = (TextView) findViewById(R.id.resultId);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier = 39.37;
                double result = 0.0;
                double meterValus = Double.parseDouble(enterMeters.getText().toString());  //setting string to a double
                result= meterValus*multiplier;
                resultTextview.setText(Double.toString(result));
            }
        });
    }
}