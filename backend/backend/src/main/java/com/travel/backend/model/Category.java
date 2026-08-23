package com.example.travel.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Service> services;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Service> getServices() { return services; }
    public void setServices(List<Service> services) { this.services = services; }
}