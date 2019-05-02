package com.example.devcash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OwnerLogin extends AppCompatActivity {

    EditText editTextOwnerEmail, editTextOwnerPassw;
    Button btnOwnerLog;
    TextView txtOwnerSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_login);

        editTextOwnerEmail = (EditText) findViewById(R.id.editText);
        editTextOwnerPassw = (EditText) findViewById(R.id.editText2);
        btnOwnerLog = (Button) findViewById(R.id.button1);

        //call the listeners
        onLoginClick();
    }

    public void onLoginClick(){
        btnOwnerLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String owner_username = editTextOwnerEmail.getText().toString();
                String owner_passw = editTextOwnerPassw.getText().toString();

                if(owner_username.equals("") || owner_passw.equals("")){
                    Toast.makeText(getApplicationContext(), "Fields can not be empty!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Successfully logged in.", Toast.LENGTH_SHORT).show();
                    Intent ownerdashboardintent = new Intent(OwnerLogin.this, NavActivity.class);
                    startActivity(ownerdashboardintent);
                }
            }
        });
    }
}
