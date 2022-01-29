package com.example.samochodyfabryka.domena;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public abstract class Samochod extends Pojazd {

    @Column(name = "model")
    private String model;
    @Column(name = "przebieg")
    private String przebieg;
    @Column(name = "cena")
    private int cena;

    public Samochod() {
        super();
    }

    public Samochod(String marka, String model, String przebieg, int cena) {
        super(marka);
        this.model = model;
        this.przebieg = przebieg;
        this.cena = cena;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(String przebieg) {
        this.przebieg = przebieg;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }


}