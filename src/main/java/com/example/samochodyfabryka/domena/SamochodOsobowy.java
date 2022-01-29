package com.example.samochodyfabryka.domena;

import com.example.samochodyfabryka.domena.Samochod;
import com.example.samochodyfabryka.fabryka.Pojazdy;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "samochody_osobowe")
public class SamochodOsobowy extends Samochod implements Pojazdy{

    @Column(name = "ilosc_miejsc")
    private int iloscMiejsc; //rozszerzenie samochodu do osobowego


    public SamochodOsobowy() {
        super();
    }

    public SamochodOsobowy(String marka, String model, String przebieg, int cena, int iloscMiejsc) {
        super(marka, model, przebieg, cena);
        this.iloscMiejsc = iloscMiejsc;
    }




    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

   public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    @Override
    public String toString() {
        return "| Samochod Osobowy | " + "\n" +
                "Dane Samochodu: " + "\n"
                + getMarka() + "\n"
                + getModel() + "\n"
                + getPrzebieg() + "km" + "\n"
                + getCena() + " PLN" + "\n"
                + iloscMiejsc;
    }
}
