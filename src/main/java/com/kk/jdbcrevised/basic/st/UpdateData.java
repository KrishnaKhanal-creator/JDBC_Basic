package com.kk.jdbcrevised.basic.st;

import com.kk.jdbcrevised.basic.dbutil.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    private static String SQL = "update student_tbl set user_name = 'jhon', password ='14kkj' where id=1";
    public static void main(String[] args) {

        try (
                Statement statement =  DbUtil.getConnection().createStatement();
                ){
            int i = statement.executeUpdate(SQL);
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
