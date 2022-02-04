package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
AppCompatButton b1,b2,b3,b4,b5;
SharedPreferences mypreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mypreferences=getSharedPreferences("test",MODE_PRIVATE);
        b1=(AppCompatButton)findViewById(R.id.addcourse);
        b2=(AppCompatButton)findViewById(R.id.addfaculty);

        b3=(AppCompatButton)findViewById(R.id.addexams);
        b4=(AppCompatButton)findViewById(R.id.viewwebsite);
        b5=(AppCompatButton)findViewById(R.id.logout);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Addcourse.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(),Addfaculty.class);
                startActivity(x);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y=new Intent(getApplicationContext(),Addexams.class);
                startActivity(y);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w=new Intent(getApplicationContext(),WebActivity.class);
                        startActivity(w);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor edit=mypreferences.edit();
                edit.clear();
                edit.commit();


                Toast.makeText(getApplicationContext(), "logout successfully", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}