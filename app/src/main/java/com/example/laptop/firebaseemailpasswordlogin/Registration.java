package com.example.laptop.firebaseemailpasswordlogin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {

    private EditText email;
    private EditText pass;
    private Button btn;
    FirebaseAuth Auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Auth=FirebaseAuth.getInstance();
        email=(EditText)findViewById(R.id.Email_edit_text_register);
        pass=(EditText)findViewById(R.id.password_edittext_register);

    }
    public void Register(View v)
    {
        final ProgressDialog progressDialog=ProgressDialog.show(Registration.this,"Please wait....","Processing",true);
       Auth.createUserWithEmailAndPassword(email.getText().toString(),pass.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
           @Override
           public void onComplete(@NonNull Task<AuthResult> task) {
               progressDialog.dismiss();
               if(task.isSuccessful())
               {
                   Toast.makeText(getApplicationContext(),"Registration Successfull",Toast.LENGTH_SHORT).show();
                   Intent i=new Intent(Registration.this,Login.class);
                   startActivity(i);
               }
           }
       });
    }
}
