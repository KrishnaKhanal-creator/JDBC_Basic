package com.kk.jdbcrevised.basic.ps;

import com.kk.jdbcrevised.basic.dbutil.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    private static String SQL = "delete from student_tbl where id = ?";
    public static void main(String[] args) {

        try (
                PreparedStatement preparedStatement =  DbUtil.getConnection().prepareStatement(SQL);
                ){
            preparedStatement.setInt(1,1);
            int i = preparedStatement.executeUpdate();
            if(i > 0 ){
                System.out.println("data Deleted");
            } else {
                System.out.println("data could not be deleted");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
