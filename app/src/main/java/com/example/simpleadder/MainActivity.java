package com.example.simpleadder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addbtn = (Button) findViewById(R.id.addBtn);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText num1 = (EditText) findViewById(R.id.firstNumET);
                EditText num2 = (EditText) findViewById(R.id.secondNumET);
                TextView res  = (TextView)  findViewById(R.id.resultTxt);

                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());

                int n3 = n1 + n2;

                res.setText(Integer.toString(n3));

            }
        });


    }


}