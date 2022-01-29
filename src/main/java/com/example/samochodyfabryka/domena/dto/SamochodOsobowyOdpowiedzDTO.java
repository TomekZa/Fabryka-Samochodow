package com.example.samochodyfabryka.domena.dto;


public class SamochodOsobowyOdpowiedzDTO {

    private String marka;
    private int iloscMiejsc;

//    public SamochodOsobowyOdpowiedzDTO() {
//    }

    public SamochodOsobowyOdpowiedzDTO(String marka, int iloscMiejsc) {
        this.marka = marka;
        this.iloscMiejsc = iloscMiejsc;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    @Override
    public String toString() {
        return "SamochodOsobowyOdpowiedzDTO{" +
                "marka='" + marka + '\'' +
                ", iloscMiejsc=" + iloscMiejsc +
                '}';
    }
}
