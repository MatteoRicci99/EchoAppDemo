package com.example.echoapp.login;

import android.database.SQLException;
import com.example.echoapp.database.DBManager;

/**
 * Inserimento delle credenziali Email e Password nel database Login
 **/

public class RegistrationManager {

    protected  DBManager db;

    public RegistrationManager(String Email, String Password,
                               String Nome, String Cognome,
                               String Immobili, String Utenze, String Auto) throws SQLException, java.sql.SQLException {
        try {
            db = new DBManager(DBManager.JDBC_Driver_SQLite, DBManager.JDBC_URL_SQLite);

            db.executeQuery("SELECT * FROM Login LIMIT 1");

        } catch (SQLException e) {

            db.executeUpdate("INSERT INTO Utente (Nome, Cognome, Immobili, Utenze, Auto)" +
                    "VALUES (" + Nome + ", " + Cognome + ", " + Immobili + ", " + Utenze + ", " + Auto + ");");

            db.executeUpdate("INSERT INTO Login (Email, Password) " +
                    "VALUES(" + Email + ", " + Password + ");");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.sql.SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
