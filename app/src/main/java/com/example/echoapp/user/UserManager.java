package com.example.echoapp.user;

import com.example.echoapp.auto.Auto;
import com.example.echoapp.database.DBManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserManager {

    private List<User> userList;
    private List<Auto> autoList;

    public List<User> getAllUsers() throws SQLException {

        ArrayList<User> users = new ArrayList<>();
        Statement statement = DBManager.getConnection().createStatement();
        String query = "SELECT * FROM Utente";
        ResultSet rs = statement.executeQuery(query);

        while(rs.next()) {
            users.add(
                    new User(rs.getInt("ID"),
                    rs.getString("Nome"),
                    rs.getString("Cognome"),
                            rs.getInt("Immobili"),
                            rs.getInt("Utenze"),
                            rs.getInt("Auto")));
        }
            statement.close();
            return users;
    }

}
