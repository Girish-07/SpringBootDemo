package com.zoro.ecommerce_mgt.service;

import com.zoro.ecommerce_mgt.entity.Product;
import com.zoro.ecommerce_mgt.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    //Get One
    public Product getOneProduct( int id){
        return repo.findById(id).orElse(new Product(404,"No Product",0,0,""));
    }


    //Get all
    public List<Product> getAllProducts(){
        return  repo.findAll();
    }

    //Post one

    public Product addOneProduct( Product product){
            return repo.save(product);
    }

    //Post all
    public List<Product> addManyProduct( List<Product> products){
       return repo.saveAll(products);
    }

    //Update
    public Product updateOneProduct( Product product){
       Product existingProduct=repo.findById(product.getProdId()).orElse(null);

       if(existingProduct!= null){
           existingProduct.setProdId(product.getProdId());
           existingProduct.setProdName(product.getProdName());
           existingProduct.setProdPrice(product.getProdPrice());
           existingProduct.setProdQty(product.getProdQty());
           existingProduct.setProdImage(product.getProdImage());

           return repo.save(existingProduct);
       }
       return null;
    }

    //Delete

    public String deleteOneProduct( int id){
        repo.deleteById(id);
        return "Deleted successfully brooo";
    }


}