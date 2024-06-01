package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Rejestracja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numerRejestracyjny;
    private LocalDate dataWydania;
    private LocalDate dataWaznosci;

    public Rejestracja(String numerRejestracyjny, LocalDate dataWydania, LocalDate dataWaznosci) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.dataWydania = dataWydania;
        this.dataWaznosci = dataWaznosci;
    }
}
