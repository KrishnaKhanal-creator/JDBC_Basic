package com.kk.jdbcrevised.basic.ps;

import com.kk.jdbcrevised.basic.dbutil.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    private static String SQL = "update student_tbl set user_name =?, password =? where id=?";
    public static void main(String[] args) {

        try (
                PreparedStatement preparedStatement =  DbUtil.getConnection().prepareStatement(SQL);
                ){
            preparedStatement.setString(1,"sila");
            preparedStatement.setString(2,"5285");
            preparedStatement.setInt(3,5);
            int i = preparedStatement.executeUpdate();
            if(i > 0 ){
                System.out.println("data updated");
            } else {
                System.out.println("data could not be updated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
