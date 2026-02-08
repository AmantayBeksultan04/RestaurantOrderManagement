package com.example.restaurant.service;

import com.example.restaurant.dao.MenuItemDAO;
import com.example.restaurant.model.MenuItem;
import com.example.restaurant.exception.InvalidMenuItemException;

import java.util.List;

public class MenuService {

    private final MenuItemDAO dao = new MenuItemDAO();

    public List<MenuItem> getAllMenuItems() throws Exception {
        return dao.getAllMenuItems();
    }

    public void addMenuItem(String name, double price) throws Exception {

        if (name == null || name.isBlank()) {
            throw new InvalidMenuItemException("Menu item name cannot be empty");
        }

        if (price <= 0) {
            throw new InvalidMenuItemException("Price must be greater than 0");
        }

        dao.addMenuItem(name, price);
    }

    public List<MenuItem> getItemsAbovePrice(double minPrice) throws Exception {

        return dao.getAllMenuItems()
                .stream()
                .filter(item -> item.getPrice() > minPrice)
                .toList();
    }


}

