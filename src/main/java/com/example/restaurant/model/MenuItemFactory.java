package com.example.restaurant.model;

import com.example.restaurant.model.MenuItem;

public class MenuItemFactory {

    public static MenuItem create(String name, double price) {
        return new MenuItem(0, name, price);
    }
}

