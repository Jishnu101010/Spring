package com.example.cw7.Controller;

import com.example.cw7.Models.ProductModels;
import com.example.cw7.Repository.productRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final productRepository productRepository;

    public ProductController(productRepository productRepository) {
        this.productRepository = productRepository;
    }

    
    @GetMapping("/products/new")
    public String showProductForm(Model model) {
        model.addAttribute("product", new ProductModels());
        return "product-form";
    }

    
    @PostMapping("/products")
    public String saveProduct(@ModelAttribute ProductModels product) {
        productRepository.save(product);
        return "redirect:/products";
    }

    
    @GetMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "product-list";
    }
}
