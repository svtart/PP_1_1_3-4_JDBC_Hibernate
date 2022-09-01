package jm.task.core.jdbc.util;

import java.sql.*;


public class Util {
    // реализуйте настройку соеденения с БД
    public Connection getConnection() {
        Connection connection = null;
        try{
            String url = "jdbc:mysql://localhost:3306/KataSpringTask1";
            String username = "root";
            String password = "12345678";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection conn = DriverManager.getConnection(url, username, password)){

                System.out.println("Connection to Store DB succesfull!");
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        } return connection;
    }
}
