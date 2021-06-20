package com.kk.jdbcrevised.basic.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreation {

    private static String  DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://localhost:3306/jdbc_revised?serverTimezone=UTC";
    private static String DB_USERNAME = "root";
    private static String DB_PASSWORD= "Mycomputer12345";
    private static String SQL = "create table user_tbl(id int not null auto_increment, user_name varchar(45), password varchar(45), primary key (id))";

    public static void main(String[] args) {

        try (
                Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                Statement statement = connection.createStatement();
                ){
            statement.execute(SQL);
            Class.forName(DRIVER_NAME);
            System.out.println("tbl created");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
