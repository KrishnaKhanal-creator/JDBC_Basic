package com.kk.jdbcrevised.basic.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static String  DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://localhost:3306/jdbc_revised?serverTimezone=UTC";
    private static String DB_USERNAME = "root";
    private static String DB_PASSWORD= "Mycomputer12345";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
}
