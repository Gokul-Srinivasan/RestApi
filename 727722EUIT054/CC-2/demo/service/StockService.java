package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Stock;
import com.example.demo.repository.StockRepo;

@Service
public class StockService {
    @Autowired
    StockRepo pr;
    public Stock add(Stock p)
    {
       return pr.save(p);
    }
    public List<Stock> get()
    {

        return pr.findAll(PageRequest.of(0, 2,Sort.by(Sort.Direction.ASC, "quantity"))).getContent();
    }
    public Optional<Stock> getbyid(int id)
    {
        return pr.findById(id);
    }
    public String delete(int id)
    {
        pr.deleteById(id);
        return "deleted";
    }
}

