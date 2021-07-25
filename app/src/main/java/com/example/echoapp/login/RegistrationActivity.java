package com.example.echoapp.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.echoapp.R;
import com.example.echoapp.database.DBManager;
import com.example.echoapp.home.HomeActivity;
import com.example.echoapp.user.User;

import java.sql.SQLException;
import java.sql.Statement;


public class RegistrationActivity extends AppCompatActivity {

    private EditText Nome;
    private EditText Cognome;
    private EditText Immobili;
    private EditText Auto;
    private EditText Email;
    private EditText Password;
    private EditText Utenze;
    private Button Registrati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Nome = findViewById(R.id.Nome);
        Cognome = findViewById(R.id.Cognome);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);


        Registrati = findViewById(R.id.buttonRegistrati);


        Registrati.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String inputEmail = Email.getText().toString();
                String inputPassword = Password.getText().toString();

                try {
                    Statement statement = DBManager.getConnection().createStatement();

                    statement.executeUpdate(
                            "INSERT INTO Utente (Nome, Cognome, Email, Password) VALUES " +
                                    "( " + Nome.getText().toString() +", "
                                    + Cognome.getText().toString() +", "
                                    + Email.getText().toString() +", "
                                    + Password.getText().toString() + ")");



                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

                startActivity(new Intent(RegistrationActivity.this, HomeActivity.class));

            }
        });

    }



}
