package com.example.cw7.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.cw7.Models.ProductModels;

public interface productRepository extends CrudRepository<ProductModels,Integer> {

}