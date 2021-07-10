package com.example.echoapp.login;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.echoapp.R;
import com.example.echoapp.home.HomeActivity;

import java.sql.SQLException;

public class LoginActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button Accedi;
    private Button Registrati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        Accedi = findViewById(R.id.buttonAccedi);
        Registrati = findViewById(R.id.buttonRegistrati);


        Accedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputEmail = Email.getText().toString();
                String inputPassword = Password.getText().toString();

                LoginManager loginManager = new LoginManager();

                try {
                    if(loginManager.isValidate(inputEmail, inputPassword)) {

                        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                    }

                    else Toast.makeText(
                            LoginActivity.this,
                            "Credenziali non corrette riprova",
                            Toast.LENGTH_SHORT).show();

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });

        Registrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
            }
        });
    }



}
