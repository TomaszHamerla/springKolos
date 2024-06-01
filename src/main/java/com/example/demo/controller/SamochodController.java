package com.example.demo.controller;

import com.example.demo.model.Samochod;
import com.example.demo.repository.SamochodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/samochody")
public class SamochodController {

    private final SamochodRepository samochodRepository;

    @GetMapping
    public Page<Samochod> findAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        return samochodRepository.findAll(PageRequest.of(page, size));
    }
}