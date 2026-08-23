package com.travel.backend.repository;

import com.travel.backend.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}