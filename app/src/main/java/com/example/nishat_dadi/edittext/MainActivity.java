package com.example.nishat_dadi.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private EditText edittext1,edittext2;
    private Button addbutton,subbutton;
    private TextView resultTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1= (EditText) findViewById(R.id.editText1);
        edittext2= (EditText) findViewById(R.id.editText2);

        addbutton = (Button) findViewById(R.id.addButton);
        subbutton = (Button) findViewById(R.id.subButton);

        resultTextview = (TextView) findViewById(R.id.resultTextview);

        addbutton.setOnClickListener(this);
        subbutton.setOnClickListener(this);

    }

    @Override

    public void onClick(View v) {

        try{
            String number1 = edittext1.getText().toString();
            String number2 = edittext2.getText().toString();

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (v.getId()==R.id.addButton){
                double sum = num1 +num2;
                resultTextview.setText("Result = "+sum);
            }
            else if(v.getId()==R.id.subButton){
                double sub = num1 -num2;
                resultTextview.setText("Result = "+sub);

            }


        }catch(Exception e){
            Toast.makeText(MainActivity.this,"Please enter buttons",Toast.LENGTH_SHORT);

        }



    }
}
