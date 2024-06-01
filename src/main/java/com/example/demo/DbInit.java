package com.example.demo;

import com.example.demo.model.Rejestracja;
import com.example.demo.model.Samochod;
import com.example.demo.repository.SamochodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class DbInit implements CommandLineRunner {
    private final SamochodRepository samochodRepository;

    @Override
    public void run(String... args) throws Exception {
        Rejestracja rejestracja1 = new Rejestracja("DW12345", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 1, 1));
        Rejestracja rejestracja2 = new Rejestracja("DW54321", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 1, 1));
        Rejestracja rejestracja3 = new Rejestracja("DW67890", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 1, 1));
        Rejestracja rejestracja4 = new Rejestracja("DW09876", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 1, 1));
        Rejestracja rejestracja5 = new Rejestracja("DW13579", LocalDate.of(2021, 1, 1), LocalDate.of(2022, 1, 1));

        samochodRepository.save(new Samochod("Audi", "A4", rejestracja1));
        samochodRepository.save(new Samochod("BMW", "X5", rejestracja2));
        samochodRepository.save(new Samochod("Mercedes", "E220", rejestracja3));
        samochodRepository.save(new Samochod("Toyota", "Corolla", rejestracja4));
        samochodRepository.save(new Samochod("Volkswagen", "Golf", rejestracja5));

    }
}
