package com.example.cw4.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.cw4.Models.Product;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class ProductController {

    @GetMapping("/singleproduct")
    public String getProduct(Model model) {
    	Product product =new Product(101,"sugar",(float)55.5);
    	   model.addAttribute("product", product);
           return "product";
       }
    @GetMapping("/ProductList")
    public String getProducts(Model, model) {
    	List<Product> products=new ArrayList<>();
    	products.add(new Product(101,"Sugar",(float)55.5));
    	products.add(new Product(102,"Salt",(float)20.0));
    	products.add(new Product(103,"Wheat Flour",(float) 38.75));
    }

}