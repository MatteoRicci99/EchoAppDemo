package com.example.echoapp.login;

import android.database.SQLException;
import com.example.echoapp.Utils;
import com.example.echoapp.database.DBManager;

/**
 * Inserimento delle credenziali Email e Password nel database Login
 **/

public class RegistrationManager {


    public RegistrationManager(String Email, String Password,
                               String Nome, String Cognome,
                               String Immobili, String Utenze, String Auto) throws SQLException, java.sql.SQLException {
        try {




        } catch (SQLException e) {

//            db.executeUpdate("INSERT INTO Utente (Nome, Cognome, Immobili, Utenze, Auto)" +
//                    "VALUES (" + Nome + ", " + Cognome + ", " + Immobili + ", " + Utenze + ", " + Auto + ");");
//
//            db.executeUpdate("INSERT INTO Login (Email, Password) " +
//                    "VALUES(" + Email + ", " + Password + ");");
        }
    }
}
