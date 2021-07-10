package com.example.echoapp.login;

import android.database.SQLException;
import com.example.echoapp.database.DBManager;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Collegamento al database Login e convalida delle credenziali
**/
public class LoginManager {

    protected DBManager dbManager;
    protected ResultSet resultSet;

    public LoginManager() throws SQLException {

        try {
            dbManager = new DBManager(DBManager.JDBC_Driver_SQLite, DBManager.JDBC_URL_SQLite);
            resultSet = dbManager.executeQuery("SELECT * FROM Login");
            resultSet.last();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.sql.SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public boolean isValidate(String Email, String Password) throws SQLException, java.sql.SQLException {

        if(Email == resultSet.getString("Email") &&
                Password == resultSet.getString("Password")) {

            return true;
        }
        else return false;
    }
}
