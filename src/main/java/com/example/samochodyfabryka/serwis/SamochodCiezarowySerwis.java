package com.example.samochodyfabryka.serwis;

import com.example.samochodyfabryka.domena.Pojazd;
import com.example.samochodyfabryka.domena.SamochodCiezarowy;
import com.example.samochodyfabryka.fabryka.Pojazdy;
import com.example.samochodyfabryka.fabryka.SamochodCiezarowyProducent;
import com.example.samochodyfabryka.repozytorium.SamochodCiezarowyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SamochodCiezarowySerwis {

    private SamochodCiezarowyProducent samochodCiezarowyProducent;
    private SamochodCiezarowyRepo samochodCiezarowyRepo;

@Autowired

    public SamochodCiezarowySerwis(SamochodCiezarowyProducent samochodCiezarowyProducent, SamochodCiezarowyRepo samochodCiezarowyRepo) {
        this.samochodCiezarowyProducent = samochodCiezarowyProducent;
        this.samochodCiezarowyRepo = samochodCiezarowyRepo;
    }

    public void zapiszSamochodCiezarowyDoBazy(){

        SamochodCiezarowy samochodCiezarowy = samochodCiezarowyProducent.utwórzPojazdStatycznie();
        samochodCiezarowyRepo.save(samochodCiezarowy);
    }
}
