package com.example.echoapp.database;

import android.database.SQLException;

public class DatabaseOperations {

    protected DBManager db;

    public DatabaseOperations() throws SQLException {

            try {
                db = new DBManager(DBManager.JDBC_Driver_SQLite, DBManager.JDBC_URL_SQLite);

                db.executeUpdate("INSERT INTO Utente (Nome, Cognome) VALUES ('Matteo', 'Ricci')");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (java.sql.SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
