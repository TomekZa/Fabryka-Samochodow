package com.example.samochodyfabryka.domena;

import com.example.samochodyfabryka.fabryka.Pojazdy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "samochody_ciezarowe")
public class SamochodCiezarowy extends Samochod {

    @Column(name = "ladownosc")
    private double ladownosc;

    public SamochodCiezarowy() {
    }

    public SamochodCiezarowy(String marka, String model, String przebieg, int cena, double ladownosc) {
        super(marka, model, przebieg, cena);
        this.ladownosc = ladownosc;
    }

    public double getLadownosc() {
        return ladownosc;
    }

    public void setLadownosc(double ladownosc) {
        this.ladownosc = ladownosc;
    }

    @Override
    public String toString() {
        return "| Samochod Ciężarowy | " + "\n" +
                "Dane Samochodu: " + "\n"
                + getMarka() + "\n"
                + getModel() + "\n"
                + getPrzebieg() + "km" + "\n"
                + getCena() + " PLN" + "\n"
                + ladownosc;
    }
}