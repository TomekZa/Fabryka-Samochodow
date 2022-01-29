package com.example.samochodyfabryka.domena;

import javax.persistence.*;

@MappedSuperclass
public abstract class Pojazd {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marka")
    private String marka;

    public Pojazd() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pojazd(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

}
