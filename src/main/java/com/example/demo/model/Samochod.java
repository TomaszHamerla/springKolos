package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Samochod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marka;
    private String model;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rejestracja_id")
    private Rejestracja rejestracja;

    public Samochod(String marka, String model, Rejestracja rejestracja) {
        this.marka = marka;
        this.model = model;
        this.rejestracja = rejestracja;
    }
}
