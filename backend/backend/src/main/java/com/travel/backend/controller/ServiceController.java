package com.travel.backend.controller;

import com.travel.backend.model.Service;
import com.travel.backend.repository.ServiceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "http://localhost:5173")
public class ServiceController {

    private final ServiceRepository repository;

    public ServiceController(ServiceRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Service> getAllServices() {
        return repository.findAll();
    }

    @PostMapping
    public Service createService(@RequestBody Service service) {
        return repository.save(service);
    }
}