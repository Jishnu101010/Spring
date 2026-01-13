package com.example.hw7.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private double price;

   
    public BookModel() {}

    public BookModel(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
