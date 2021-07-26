package com.example.echoapp.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.echoapp.R;
import com.example.echoapp.database.DBHelper;
import com.example.echoapp.database.DBManager;
import com.example.echoapp.home.HomeActivity;
import com.example.echoapp.user.User;

import java.sql.SQLException;
import java.sql.Statement;


public class RegistrationActivity extends AppCompatActivity {

    private EditText Nome;
    private EditText Cognome;
    private EditText Immobili;
    private EditText Utenze;
    private EditText Auto;
    private EditText Email;
    private EditText Password;
    private Button Registrati;

    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Nome = findViewById(R.id.Nome);
        Cognome = findViewById(R.id.Cognome);
        Immobili = findViewById(R.id.nImmobili);
        Utenze = findViewById(R.id.nUtenze);
        Auto = findViewById(R.id.nAuto);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);

        Registrati = findViewById(R.id.buttonRegistrati);

        DB = new DBHelper(this);

        Registrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputNome = Nome.getText().toString();
                String inputCognome = Cognome.getText().toString();
                String inputImmobili = Immobili.getText().toString();
                String inputEmail = Email.getText().toString();
                String inputPassword = Password.getText().toString();


                if(inputEmail.equals("") || inputPassword.equals("")) {
                    Toast.makeText(
                            RegistrationActivity.this,
                            "Inserisci tutte le credenziali",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean check = DB.checkEmail(inputEmail);
                    if(check == false) {
                        Boolean add = DB.add(1, inputNome, inputCognome,
                                1, 1, 1,
                                inputEmail, inputPassword);
                        if(add == true) {
                            Toast.makeText(
                                    RegistrationActivity.this,
                                    "Registrazione completata",
                                    Toast.LENGTH_SHORT).show();

                            startActivity(new Intent(RegistrationActivity.this, HomeActivity.class));
                        }
                        else {
                            Toast.makeText(
                                    RegistrationActivity.this,
                                    "Registrazione fallita...riprova",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                    else Toast.makeText(
                            RegistrationActivity.this,
                            "Utente già registrato",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
