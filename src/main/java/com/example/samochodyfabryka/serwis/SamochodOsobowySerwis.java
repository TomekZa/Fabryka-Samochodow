package com.example.samochodyfabryka.serwis;

import com.example.samochodyfabryka.domena.SamochodOsobowy;
import com.example.samochodyfabryka.domena.dto.PojazdyDTOConverter;
import com.example.samochodyfabryka.domena.dto.SamochodOsobowyFullDTO;
import com.example.samochodyfabryka.domena.dto.SamochodOsobowyOdpowiedzDTO;
import com.example.samochodyfabryka.fabryka.PojazdFabryka;
import com.example.samochodyfabryka.fabryka.SamochodOsobowyProducent;
import com.example.samochodyfabryka.fabryka.TypPojazduENUM;
import com.example.samochodyfabryka.repozytorium.SamochodOsobowyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SamochodOsobowySerwis {

    private SamochodOsobowyProducent samochodOsobowyProducent;
    private SamochodOsobowyRepo samochodOsobowyRepo;
    private PojazdFabryka pojazdFabryka;
    private PojazdyDTOConverter pojazdyDTOConverter;

    @Autowired
    public SamochodOsobowySerwis(SamochodOsobowyProducent samochodOsobowyProducent, SamochodOsobowyRepo samochodOsobowyRepo, @Qualifier("samochodOsobowyProducent") PojazdFabryka pojazdFabryka, PojazdyDTOConverter pojazdyDTOConverter) {
        this.samochodOsobowyProducent = samochodOsobowyProducent;
        this.samochodOsobowyRepo = samochodOsobowyRepo;
        this.pojazdFabryka = pojazdFabryka;
        this.pojazdyDTOConverter = pojazdyDTOConverter;

    }


    public SamochodOsobowy zapiszSamochodOsobowyDoBazy(SamochodOsobowyFullDTO samochodOsobowyFullDTO) {

        //    PojazdFabryka osobowka = new SamochodOsobowyProducent(); //nie działa fabryka
//        osobowka.utworzPojazd(samochodOsobowy);

        return samochodOsobowyRepo.save(pojazdyDTOConverter.konwertujDoOsobowki(samochodOsobowyFullDTO));


    }

    public SamochodOsobowy zapiszSamochodOsobowyFabryka(TypPojazduENUM typPojazduENUM, SamochodOsobowyFullDTO samochodOsobowyFullDTO) {

        PojazdFabryka<SamochodOsobowyFullDTO> osobowka = new SamochodOsobowyProducent(); // wymyślić żeby to powiązać, może klucz-wartosc
        osobowka.utworzPojazd(samochodOsobowyFullDTO, typPojazduENUM);


        //return samochodOsobowyRepo.save(pojazdyDTOConverter.konwertujDoOsobowki(samochodOsobowyFullDTO)); // przekazac dto dalej?
        return samochodOsobowyRepo.save(samochodOsobowyProducent.zapiszDoBazyNowySamochod());


    }

    public void inicjalizacjaBazySamochodOsobowy() {

        SamochodOsobowy samochodOsobowy = samochodOsobowyProducent.utworzPojazdStatycznie();

        samochodOsobowyRepo.save(samochodOsobowy);  // dziala bez castowania
    }

    public List<SamochodOsobowyOdpowiedzDTO> pobierzSkroconeInfoSamochoduOsobowego() {

        return pojazdyDTOConverter.konwertujDoDTO();

    }

    public List<SamochodOsobowy> pobierzWszystkieSamochodyOsobowe() {
        return samochodOsobowyRepo.findAll();
    }

}
