package com.kk.jdbcrevised.basic.st;

import com.kk.jdbcrevised.basic.dbutil.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    private static String SQL = "delete from student_tbl where id = 2";
    public static void main(String[] args) {

        try (
                Statement statement =  DbUtil.getConnection().createStatement();
                ){
            int i = statement.executeUpdate(SQL);
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
