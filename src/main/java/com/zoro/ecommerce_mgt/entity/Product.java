package com.zoro.ecommerce_mgt.entity;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;


@Entity
@Table(name="ecomProds")
@JsonPropertyOrder({
        "prodId",
        "prodName",
        "prodPrice",
        "prodQty",
        "prodImage"
})


public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prodId;


    private String prodName;
    private Integer prodPrice;
    private Integer prodQty;

    @Column(length = 2000)
    private String prodImage;

    public Product() {
    }

    public Product(Integer prodId, String prodName, Integer prodPrice, Integer prodQty, String prodImage) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodQty = prodQty;
        this.prodImage = prodImage;
    }
    public String getProdImage() {
        return prodImage;
    }



    public void setProdImage(String prodImage) {
        this.prodImage = prodImage;
    }



    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Integer getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Integer prodPrice) {
        this.prodPrice = prodPrice;
    }

    public Integer getProdQty() {
        return prodQty;
    }

    public void setProdQty(Integer prodQty) {
        this.prodQty = prodQty;
    }
}