package com.example.samochodyfabryka.kontroler;

import com.example.samochodyfabryka.serwis.SamochodCiezarowySerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SamochodCiezarowyKonsola {

    private SamochodCiezarowySerwis samochodCiezarowySerwis;

    @Autowired
    public SamochodCiezarowyKonsola(SamochodCiezarowySerwis samochodCiezarowySerwis) {
        this.samochodCiezarowySerwis = samochodCiezarowySerwis;
        uruchomSerwisCiezarowki();
    }

    public void uruchomSerwisCiezarowki(){

        samochodCiezarowySerwis.zapiszSamochodCiezarowyDoBazy();
    }
}
