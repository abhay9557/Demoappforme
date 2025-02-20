package com.newapp.demonewapp.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Product {

        @Id
        private int prodid;
       private String name;
       @Column(name ="desc")
        private String desc;
        private String brand;
        private BigDecimal price;
        private String category;
        private Date releasedate;
        private Boolean availablity;
        private int quantity;

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Boolean getAvailablity() {
        return availablity;
    }

    public void setAvailablity(Boolean availablity) {
        this.availablity = availablity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(int quantity, Boolean availablity, Date releasedate, String category, BigDecimal price, String brand, String desc, String name, int prodid) {
        this.quantity = quantity;
        this.availablity = availablity;
        this.releasedate = releasedate;
        this.category = category;
        this.price = price;
        this.brand = brand;
        this.desc = desc;
        this.name = name;
        this.prodid = prodid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodid=" + prodid +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", releasedate=" + releasedate +
                ", availablity=" + availablity +
                ", quantity=" + quantity +
                '}';
    }
    public Product() { }
}


