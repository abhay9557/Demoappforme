package com.newapp.demonewapp.Service;

import com.newapp.demonewapp.Model.Product;
import com.newapp.demonewapp.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
   private Productrepo repo;

    public List<Product> getallproduct() {
        return repo.findAll();
    }

    public Product getproduct(int prodid) {
        return repo.findById(prodid).orElse(null);
    }

    public Product updateproduct(int prodid, Product product) {
        return repo.save(product);
    }

    public void deleteproduct(int prodid) {
        repo.deleteById(prodid);

    }
}
