package com.example.samochodyfabryka.fabryka;


import com.example.samochodyfabryka.domena.Pojazd;
import com.example.samochodyfabryka.domena.SamochodCiezarowy;
import org.springframework.stereotype.Service;

@Service
public class SamochodCiezarowyProducent implements PojazdFabryka{




    public SamochodCiezarowy utwórzPojazdStatycznie(){

       return tworzenieCiezarowkiStatycznie("Volvo", "FH 500", "750000", 177900, 40);

    }

    private SamochodCiezarowy tworzenieCiezarowkiStatycznie(String marka, String model, String przebieg, int cena, double ladownosc){

        SamochodCiezarowy samochodCiezarowy = new SamochodCiezarowy(marka, model, przebieg, cena, ladownosc);
        samochodCiezarowy.setMarka(marka);
        samochodCiezarowy.setModel(model);
        samochodCiezarowy.setPrzebieg(przebieg);
        samochodCiezarowy.setCena(cena);
        samochodCiezarowy.setLadownosc(ladownosc);

        return samochodCiezarowy;
    }

    @Override
    public Pojazdy utworzPojazd(Object pojazd, TypPojazduENUM typPojazdu) {
        return null;
    }


//    @Override
//    public Pojazdy utworzPojazd(TypPojazduENUM typPojazdu, Pojazdy pojazd) {
//        return null;
//    }



}
