package com.example.androues.motionnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText us;
    private EditText pass;
    private Button lgn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        us = findViewById(R.id.us);
        pass = findViewById(R.id.pass);
        lgn = findViewById(R.id.lgn);


        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = us.getText().toString();
                String password = pass.getText().toString();

                if(user.equals("andro")  && password.equals("123456")){

                }else{

                }

            }
        });
    }
}
