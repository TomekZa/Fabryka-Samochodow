package com.example.samochodyfabryka.kontroler;

import com.example.samochodyfabryka.serwis.SamochodOsobowySerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SamochodOsobowyKonsola {

    private SamochodOsobowySerwis samochodOsobowySerwis;

    @Autowired
    public SamochodOsobowyKonsola(SamochodOsobowySerwis samochodOsobowySerwis) {
        this.samochodOsobowySerwis = samochodOsobowySerwis;
        uruchomServis();
    }



    public void uruchomServis(){

        samochodOsobowySerwis.inicjalizacjaBazySamochodOsobowy();

    }

    }
