package com.zoro.ecommerce_mgt.controller;

import com.zoro.ecommerce_mgt.entity.Product;
import com.zoro.ecommerce_mgt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin

public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product getOneProduct(@PathVariable int id){
        return productService.getOneProduct(id);
    }
    @GetMapping("/")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }


    @PostMapping("/add/one")
    public Product addOneProduct(@RequestBody Product product){
        return productService.addOneProduct(product);
    }

    @PostMapping("/add/all")
    public List<Product> getAllProducts(@RequestBody List<Product> products){
        return productService.addManyProduct(products);
    }

    @PutMapping("/update")
    public Product updateOneProduct(@RequestBody Product product){
        return productService.updateOneProduct(product);
    }

    @DeleteMapping("/{id}")
    public String deleteOneProduct(@PathVariable int id){
        return productService.deleteOneProduct(id);
    }

}