package com.newapp.demonewapp;

import com.newapp.demonewapp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface Productrepo extends JpaRepository<Product,Integer> {

}
