package com.awad.adam.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.awad.adam.myapplication.mainlistfragments.MainListActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static com.awad.adam.myapplication.R.id.btnsignup;
import static com.awad.adam.myapplication.R.id.etpass;

public class signup extends AppCompatActivity {
    private EditText etname;
    private EditText etmail;
    private EditText etpass;
    private EditText etRepass;
    private Button btnsave;
    private FirebaseAuth auth;
    private FirebaseUser firebaseUse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        auth = FirebaseAuth.getInstance();
        firebaseUse = auth.getCurrentUser();
        if (firebaseUse == null) {
            // Not signed in, launch the Sign In activity
            startActivity(new Intent(this,signup.class));
            finish();
            return;
        } else {
            String userName = firebaseUse.getDisplayName();
            if (firebaseUse.getPhotoUrl() != null) {
                String photoUrl = firebaseUse.getPhotoUrl().toString();
        }

        etmail=(EditText)findViewById(R.id.etmail);
        etname=(EditText)findViewById(R.id.etname);
        etpass=(EditText)findViewById(R.id.etpass);
        etRepass=(EditText)findViewById(R.id.etRepass);
        btnsave=(Button)findViewById(R.id.btnsave);



    }
  }

      }

      private void dataHandler()
      {
          String stEmail=etmail.getText().toString();
          String etName=etname.getText().toString();
          String stPass=etpass.getText().toString();
          String strepass=etRepass.getText().toString();
          boolean isOK=true;//tochek if all felids are filled correctly
          if (stEmail.length()==0|| stEmail.indexOf("@")<1)
          {
              etmail.setError("Wrong Email");
              isOK=false;

          }
          if ((stPass.length()<8 || stPass.equals(strepass)==false
          {
              etpass.setError("Bad Password");
              isOK=false;
          }
          if (isOK)
              creatAcount(stEmail,stPass);

      }
    private void creatAcount(String email, String passw) {
        auth.createUserWithEmailAndPassword(email,passw).addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(SignUpActivity.this, "Authentication Successful.", Toast.LENGTH_SHORT).show();
                    //updateUserProfile(task.getResult().getUser());
                    finish();
                }
                else
                {
                    Toast.makeText(SignUpActivity.this, "Authentication failed."+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    task.getException().printStackTrace();
                }
            }
        });
    }









