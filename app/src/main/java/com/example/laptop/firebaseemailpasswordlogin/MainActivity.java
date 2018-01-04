package com.example.laptop.firebaseemailpasswordlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Login(View v)
    {
        Intent i=new Intent(MainActivity.this,Login.class);
        startActivity(i);
    }
    public void Registration(View v)
    {
        Intent i=new Intent(MainActivity.this,Registration.class);
        startActivity(i);
    }
}
