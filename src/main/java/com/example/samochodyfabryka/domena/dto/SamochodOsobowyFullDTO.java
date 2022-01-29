package com.example.samochodyfabryka.domena.dto;

import com.example.samochodyfabryka.domena.Samochod;
import com.example.samochodyfabryka.fabryka.Pojazdy;
import org.springframework.stereotype.Component;

@Component
public class SamochodOsobowyFullDTO implements Pojazdy {

    private String marka;
    private String model;
    private String przebieg;
    private int cena;
    private int iloscMiejsc;

    public SamochodOsobowyFullDTO() {
    }

    public SamochodOsobowyFullDTO(String marka, String model, String przebieg, int cena, int iloscMiejsc) {
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.cena = cena;
        this.iloscMiejsc = iloscMiejsc;
    }

    public SamochodOsobowyFullDTO(Pojazdy pojazd) {

    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getPrzebieg() {
        return przebieg;
    }

    public int getCena() {
        return cena;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }
}
