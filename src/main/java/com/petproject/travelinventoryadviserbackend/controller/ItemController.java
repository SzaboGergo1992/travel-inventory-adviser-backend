package com.petproject.travelinventoryadviserbackend.controller;

import com.petproject.travelinventoryadviserbackend.entity.Item;
import com.petproject.travelinventoryadviserbackend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/items")
    public List<Item> fetchItems() {
        return itemRepository.findAll();
    }
}
