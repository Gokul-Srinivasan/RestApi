package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    public int productId;
    public String productName;
    public String dealer;
    public String dealerType;
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getDealer() {
        return dealer;
    }
    public void setDealer(String dealer) {
        this.dealer = dealer;
    }
    public String getDealerType() {
        return dealerType;
    }
    public void setDealerType(String dealerType) {
        this.dealerType = dealerType;
    }
    
    
}
