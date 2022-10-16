package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//   private Button button;
//   private EditText editText1;
//   private EditText editText2;
//   private EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button=findViewById(R.id.button);
//        editText1=findViewById(R.id.editTextNumber);
//        editText2=findViewById(R.id.editTextNumber2);
//        editText3=findViewById(R.id.editTextTextPersonName);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override


    }



    public void Add(View v) {


                EditText tv1 = (EditText) findViewById(R.id.editTextNumber1);
                EditText tv2 = (EditText) findViewById(R.id.editTextNumber2);
                EditText tv3 = (EditText) findViewById(R.id.editTextTextPersonName);

        int a = Integer.parseInt(tv1.getText().toString());
        int b = Integer.parseInt(tv2.getText().toString());

        int result = a+b;

        tv3.setText("Results : " + result);
        Toast.makeText(MainActivity.this, "Thanks for using Calculator", Toast.LENGTH_SHORT).show();

    }


     public  void Subtract(View v){

         EditText tv1 = (EditText) findViewById(R.id.editTextNumber1);
         EditText tv2 = (EditText) findViewById(R.id.editTextNumber2);
         EditText tv3 = (EditText) findViewById(R.id.editTextTextPersonName);

         int a = Integer.parseInt(tv1.getText().toString());
         int b = Integer.parseInt(tv2.getText().toString());

         int result = a-b;

         tv3.setText("Results : " + result);
         Toast.makeText(this, "Thanks for using Calculator", Toast.LENGTH_SHORT).show();

     }
    public  void Multiply(View v){

        EditText tv1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText tv2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText tv3 = (EditText) findViewById(R.id.editTextTextPersonName);

        int a = Integer.parseInt(tv1.getText().toString());
        int b = Integer.parseInt(tv2.getText().toString());

        int result = a * b;

        tv3.setText("Results : " + result);
        Toast.makeText(this, "Thanks for using Calculator", Toast.LENGTH_SHORT).show();

    }


    public  void Divide(View v){

        EditText tv1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText tv2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText tv3 = (EditText) findViewById(R.id.editTextTextPersonName);

        int a = Integer.parseInt(tv1.getText().toString());
        int b = Integer.parseInt(tv2.getText().toString());

        int result = a / b;

        tv3.setText("Results : " + result);
        Toast.makeText(this, "Thanks for using Calculator", Toast.LENGTH_SHORT).show();

    }


}