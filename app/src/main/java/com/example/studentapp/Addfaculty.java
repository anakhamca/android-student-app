package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Addfaculty extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getfname,getdept,getdes,getmob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfaculty);
        ed1=(EditText)findViewById(R.id.fname);
        ed2=(EditText)findViewById(R.id.dept);
        ed3=(EditText)findViewById(R.id.des);
        ed4=(EditText)findViewById(R.id.mob);
        b1=(AppCompatButton)findViewById(R.id.submit);
        b2=(AppCompatButton)findViewById(R.id.backtodash);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getfname=ed1.getText().toString();
                getdept=ed2.getText().toString();
                getdes=ed3.getText().toString();
                getmob=ed4.getText().toString();
                Toast.makeText(getApplication(),getfname,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplication(),getdept,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplication(),getdes,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplication(),getmob,Toast.LENGTH_SHORT).show();




            }
        });

    }
}