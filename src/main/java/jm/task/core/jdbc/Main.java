package jm.task.core.jdbc;

import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) {

        Util util = new Util();
        util.getConnection();
    }
}