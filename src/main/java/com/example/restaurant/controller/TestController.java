package com.example.restaurant.controller;

import com.example.restaurant.model.MenuItem;
import com.example.restaurant.service.MenuService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
public class TestController {

    private final MenuService service = new MenuService();

    @GetMapping("/menu")
    public List<MenuItem> getMenu() throws Exception {
        return service.getAllMenuItems();
    }

    @PostMapping("/menu")
    public String addMenuItem(
            @RequestParam String name,
            @RequestParam double price) throws Exception {

        service.addMenuItem(name, price);
        return "Menu item added";
    }

    @GetMapping("/menu/filter")
    public List<MenuItem> filterByPrice(@RequestParam double minPrice) throws Exception {
        return service.getItemsAbovePrice(minPrice);
    }



}



