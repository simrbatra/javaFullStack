package com.example.DemoProject;

public class Product {
    private Long id;
    private String name;

    public Product() {}

    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "'}";
    }
}
