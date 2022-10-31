package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView lupa;
        TextView login;
        TextView register;

        login = findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginn = new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(loginn);
            }
        });

        register = findViewById(R.id.registerakun);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regiss = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(regiss);
            }
        });

        lupa = findViewById(R.id.lupapass);
        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lupapass = new Intent(LoginActivity.this,PulihkanActivity.class);
                startActivity(lupapass);
            }
        });


    }
}