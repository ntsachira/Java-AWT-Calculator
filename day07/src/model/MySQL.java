/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class MySQL {

    private static  Connection c;
    private static final String username = "root";
    private static final String password = "#Love0923";
    private static final String database = "sad2";
    

    public static Statement createConnection() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database, username, password);

        }
        Statement s = c.createStatement();

        return s;
    }

    public static void iud(String query) {
        try {
            createConnection().executeUpdate(query);

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static ResultSet search(String query) throws Exception {

        ResultSet rs = createConnection().executeQuery(query);

        return (rs);

    }
}