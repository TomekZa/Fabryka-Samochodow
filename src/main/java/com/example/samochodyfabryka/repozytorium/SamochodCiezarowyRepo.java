package com.example.samochodyfabryka.repozytorium;

import com.example.samochodyfabryka.domena.Pojazd;
import com.example.samochodyfabryka.domena.SamochodCiezarowy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SamochodCiezarowyRepo extends JpaRepository<Pojazd, Long> {
}
