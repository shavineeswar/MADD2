package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button btna,btns,btnm,btnd;
    EditText et3,et4;
    TextView t1;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        btna=findViewById(R.id.btn1);
        btns=findViewById(R.id.btn2);
        btnm=findViewById(R.id.btn3);
        btnd=findViewById(R.id.btn4);

        et3=findViewById(R.id.etxtn3);
        et4=findViewById(R.id.etxtn4);

        t1=findViewById(R.id.txt1);

        String n1=getIntent().getStringExtra("value1");
       // String n2=et4.getText().toString();
        String n2 =getIntent().getStringExtra("value2");

        String result = "";

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.putExtra("msg",1);
                startActivity(i);

                String n1=getIntent().getStringExtra("value1");
                // String n2=et4.getText().toString();
                String n2 =getIntent().getStringExtra("value2");

                String result;
              result =n1+"+"+n2+"="+(n1+n2);

            }
        });

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.putExtra("msg",2);
                startActivity(i);

                String n1=getIntent().getStringExtra("value1");
                // String n2=et4.getText().toString();
                String n2 =getIntent().getStringExtra("value2");

                String result;
                result =n1+"-"+n2+"="+(n1-n2);

            }
        });

        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.putExtra("msg",3);
                startActivity(i);

                String n1=getIntent().getStringExtra("value1");
                // String n2=et4.getText().toString();
                String n2 =getIntent().getStringExtra("value2");

                String result;
                result =n1+"*"+n2+"="+(n1*n2);
            }
        });


        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_VIEW);
                i.putExtra("msg",4);
                startActivity(i);

                String n1=getIntent().getStringExtra("value1");
                // String n2=et4.getText().toString();
                String n2 =getIntent().getStringExtra("value2");

                String result;
                result =n1+"/"+n2+"="+(n1/n2);
            }
        });

        String v =getIntent().getStringExtra("msg");

        if(v=="1")
        {
            t1.setText(result);
        }
        else if(v=="2")
        {
            t1.setText(result);
        }
        else if(v=="3")
        {
            t1.setText(result);
        }
        else if(v=="4")
        {
            t1.setText(result);
        }


    }
}