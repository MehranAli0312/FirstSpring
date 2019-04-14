package com.example.sample.controller;

import com.example.sample.dao.DAOVendingMachine;
import com.example.sample.model.ItemVendingMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/vendingMachine")
public class ControllerVendingMachine {

    @Autowired
    DAOVendingMachine dao;

    @GetMapping
    public List<ItemVendingMachine> getAllItems() throws Exception {
        return dao.getAllItems();
    }
}
