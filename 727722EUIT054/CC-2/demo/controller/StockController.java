package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Stock;
import com.example.demo.service.StockService;


@RestController
public class StockController {
    @Autowired
    StockService ps;
    @PostMapping("/api/stock/add")
    public ResponseEntity<Stock> addmethod(@RequestBody Stock p)
    {
        return new ResponseEntity<>(ps.add(p),HttpStatus.CREATED);
    }
    @GetMapping("/api/stock")
    public List<Stock> getmethod()
    {
           return ps.get();
    }
    @GetMapping("/api/stock/{stockId}")
    public Optional<Stock> getbymethod(@PathVariable int stockId)
    {
        return ps.getbyid(stockId);
    }
   
    @DeleteMapping("/delete/{id}")
    public String del(@PathVariable int id)
    {
        return ps.delete(id);
    }
}