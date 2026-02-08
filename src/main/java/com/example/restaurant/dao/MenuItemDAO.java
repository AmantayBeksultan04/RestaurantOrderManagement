package com.example.restaurant.dao;

import com.example.restaurant.model.MenuItem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuItemDAO {

    private final String URL = "jdbc:postgresql://localhost:5432/Java_Project";
    private final String USER = "postgres";
    private final String PASSWORD = "crazyd1amond";

    public List<MenuItem> getAllMenuItems() throws Exception {

        List<MenuItem> list = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name, price FROM menu_item")) {

            while (rs.next()) {
                list.add(new MenuItem(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price")
                ));
            }
        }

        return list;
    }

    public void addMenuItem(String name, double price) throws Exception {

        String sql = "INSERT INTO menu_item(name, price) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setDouble(2, price);

            stmt.executeUpdate();
        }
    }
}
