package jm.task.core.jdbc.util;

import java.sql.*;


public class Util {
    // реализуйте настройку соеденения с БД

    public static Connection getConnection() {
        Connection connection = null;
        String URL = "jdbc:mysql://localhost:3306/KataSpringTask1";
        String USERNAME = "root";
        String PASSWORD = "12345678";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection to Store DB succesfull!");
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        } return connection;
    }
}
