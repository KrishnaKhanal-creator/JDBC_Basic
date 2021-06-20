package com.kk.jdbcrevised.basic.ps;

import com.kk.jdbcrevised.basic.dbutil.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    private static String SQL = "insert into student_tbl(user_name, password)values(?,?)";
    public static void main(String[] args) {

        try (
                PreparedStatement preparedStatement =  DbUtil.getConnection().prepareStatement(SQL);
                ){
            preparedStatement.setString(1,"jhon");
            preparedStatement.setString(2,"2568");
            int i = preparedStatement.executeUpdate();
            if(i > 0 ){
                System.out.println("data inserted");
            } else {
                System.out.println("data could not be updated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
