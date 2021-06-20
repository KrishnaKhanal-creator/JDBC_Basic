package com.kk.jdbcrevised.basic.ps;

import com.kk.jdbcrevised.basic.dbutil.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {
    private static String SQL = "select * from student_tbl";
    public static void main(String[] args) {

        try (
                PreparedStatement preparedStatement =  DbUtil.getConnection().prepareStatement(SQL);
                ){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("Id: " + resultSet.getString("id"));
                System.out.println("user name: " + resultSet.getString("user_name"));
                System.out.println("password: " + resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
