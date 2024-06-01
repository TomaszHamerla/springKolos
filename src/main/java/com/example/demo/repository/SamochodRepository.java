package com.example.demo.repository;

import com.example.demo.model.Samochod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamochodRepository extends JpaRepository<Samochod, Long> {
}
