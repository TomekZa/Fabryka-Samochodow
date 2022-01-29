package com.example.samochodyfabryka.fabryka;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Arrays;

public enum TypPojazduENUM {

    OSOBOWY("samochod-osobowy"),
    CIEZAROWY("samochod-ciezarowy");

    private String typPojazdu;

    TypPojazduENUM(String typPojazdu) {
        this.typPojazdu = typPojazdu;
    }

    public String getTypPojazdu() {
        return typPojazdu;
    }

//    public static TypPojazduENUM fromValue(String value) {
//        for (TypPojazduENUM category : values()) {
//            if (category.typPojazdu.equalsIgnoreCase(value))
//            {
//                return category;
//            }
//        }
//        throw new IllegalArgumentException(
//                "Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
//    }
}