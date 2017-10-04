package com.awad.adam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etemail;
    private EditText etpass;
    private Button btnsignup;
    private Button btnfotgot;
    private Button btnsigin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etemail=(EditText)findViewById(R.id.etmail);
        etpass=(EditText)findViewById(R.id.etpass);
        btnfotgot=(Button) findViewById(R.id.btnforgot);
        btnsigin=(Button) findViewById(R.id.btnsignin);
        btnsignup=(Button) findViewById(R.id.btnsignup);
    }
}



