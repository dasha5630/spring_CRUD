package ru.tdv;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionTest {

    @Test
    public void dbConnection() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Moscow&useSSL=false", "root", "root")) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
