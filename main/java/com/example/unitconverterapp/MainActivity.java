package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText cm,m;
    Button converter,converter1;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cm=findViewById(R.id.editcm);
        converter=findViewById(R.id.converter);
        result=findViewById(R.id.result);
        m=findViewById(R.id.editm);
        converter1=findViewById(R.id.converter1);



        converter.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                String textcm=cm.getText().toString();
                double input = Double.parseDouble(textcm);
                double output=input*0.01;
                result.setText(""+output+"metre");










            }
        });
        converter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String metre=m.getText().toString();
                double input1=Double.parseDouble(metre);
                double output1=input1*0.001;
                result.setText(""+output1+"KiloMetre");
            }
        });
    }
}