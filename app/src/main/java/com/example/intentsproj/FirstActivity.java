package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);



        et1=findViewById(R.id.etxn1);
        et2=findViewById(R.id.etxtn2);
        btn1=findViewById(R.id.bntok);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val1=et1.getText().toString();
                String val2=et2.getText().toString();
                Intent i=new Intent(FirstActivity.this,SecondActivity.class);
                i.putExtra("value1",val1);
                i.putExtra("value2",val2);

                startActivity(i);
            }
        });








    }
}