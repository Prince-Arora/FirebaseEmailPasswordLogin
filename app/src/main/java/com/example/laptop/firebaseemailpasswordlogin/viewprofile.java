package com.example.laptop.firebaseemailpasswordlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class viewprofile extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewprofile);
        tv=(TextView)findViewById(R.id.viewprofile);
        tv.setText(getIntent().getExtras().getString("Email"));
    }
}
