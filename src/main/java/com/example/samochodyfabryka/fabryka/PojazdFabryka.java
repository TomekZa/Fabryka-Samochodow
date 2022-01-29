package com.example.samochodyfabryka.fabryka;

public interface PojazdFabryka<T> extends Pojazdy{


    Pojazdy utworzPojazd(T pojazd, TypPojazduENUM typPojazdu);
}

