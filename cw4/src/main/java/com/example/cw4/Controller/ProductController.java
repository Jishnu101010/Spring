package com.example.cw4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.cw4.Model.Product;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/singleproduct")
    public String singleProduct(Model model) {
        Product product = new Product(101, "Sugar", 55.5);
        model.addAttribute("product", product);
        return "single-product";
    }

    @GetMapping("/productlist")
    public String productList(Model model) {
        List<Product> products = Arrays.asList(
                new Product(101, "Sugar", 55.5),
                new Product(102, "Salt", 20.0),
                new Product(103, "Wheat Flour", 38.75)
        );
        model.addAttribute("products", products);
        return "productlist";
    }
}
