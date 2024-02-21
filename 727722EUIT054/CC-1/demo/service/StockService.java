package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
        return pr.findAll();
    }
    public Optional<Stock> getbyid(int id)
    {
        return pr.findById(id);
    }
    public Stock put(int id,Stock s)
    {
        Stock us=pr.findById(id).orElse(null);
        if(us!=null)
        {
            us.setStockName(s.getStockName());
            us.setDescription(s.getDescription());
            us.setPrice(s.getPrice());
            us.setQuantity(s.getQuantity());
            return pr.saveAndFlush(us);
        }
        else
        return null;
    }
    public String delete(int id)
    {
        pr.deleteById(id);
        return "deleted";
    }
}

