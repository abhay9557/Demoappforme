package com.newapp.demonewapp.Controller;

import com.newapp.demonewapp.Model.Product;
import com.newapp.demonewapp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController
{
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getallproduct(){
        return new ResponseEntity<>(service.getallproduct(),HttpStatus.OK);
    }
    @GetMapping("/products/{prodid}")
    public ResponseEntity<Product> getproduct(@PathVariable int prodid){
        Product product= service.getproduct(prodid);
        if(product !=null)
            return new ResponseEntity<>(product,HttpStatus.OK);
            else
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @PutMapping("/products/{prodid}")
    public ResponseEntity<String> updateproduct(@PathVariable int prodid, Product product){
        Product product1=service.updateproduct(prodid,product);
        if(product !=null)
        return new ResponseEntity<>("updated..",HttpStatus.OK);
        else
            return new ResponseEntity<>("no data..", HttpStatus.BAD_REQUEST);
    }
    @DeleteMapping("/products/{prodid}")
    public ResponseEntity<String> deleteproduct(@PathVariable int prodid){
        Product product = service.getproduct(prodid);
        if(product!=null) {
            service.deleteproduct(prodid);
            return new ResponseEntity<>("Deleted..", HttpStatus.OK);
        }
        else
            return new ResponseEntity<>("product nit found..,",HttpStatus.NO_CONTENT);

    }

}
