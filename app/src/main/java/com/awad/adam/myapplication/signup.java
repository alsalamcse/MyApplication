package com.awad.adam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {
    private EditText etname;
    private EditText etmail;
    private EditText etpass;
    private EditText etRepass;
    private Button btnsave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etmail=(EditText)findViewById(R.id.etmail);
        etname=(EditText)findViewById(R.id.etname);
        etpass=(EditText)findViewById(R.id.etpass);
        etRepass(EditText)findViewById(R.id.etre_pass);
        btnsave(Button)findViewById(R.id.btnsave);


    }
}
