package com.example.samochodyfabryka.repozytorium;

import com.example.samochodyfabryka.domena.Pojazd;
import com.example.samochodyfabryka.domena.Samochod;
import com.example.samochodyfabryka.domena.SamochodOsobowy;
import com.example.samochodyfabryka.fabryka.Pojazdy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SamochodOsobowyRepo extends JpaRepository<SamochodOsobowy, Long> {
}
