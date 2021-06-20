package com.kk.jdbcrevised.basic.st;

import com.kk.jdbcrevised.basic.dbutil.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    private static String SQL = "insert into student_tbl(user_name, password)values('gita','7410')";
    public static void main(String[] args) {

        try (
                Statement statement =  DbUtil.getConnection().createStatement();
                ){
            int i = statement.executeUpdate(SQL);
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
