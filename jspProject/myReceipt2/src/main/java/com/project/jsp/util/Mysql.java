package com.project.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.cj.jdbc.Driver;

public class Mysql {
    private static final String URL = "jdbc:mysql://localhost:3306/xe";
    private static final String USER = "scott";
    private static final String PASSWORD = "tiger";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, "MySQL JDBC Driver not found", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


