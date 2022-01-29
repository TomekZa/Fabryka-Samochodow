package com.example.samochodyfabryka.kontroler;

import com.example.samochodyfabryka.domena.SamochodOsobowy;
import com.example.samochodyfabryka.domena.dto.SamochodOsobowyFullDTO;
import com.example.samochodyfabryka.domena.dto.SamochodOsobowyOdpowiedzDTO;
import com.example.samochodyfabryka.fabryka.TypPojazduENUM;
import com.example.samochodyfabryka.serwis.SamochodOsobowySerwis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Enumerated;
import javax.persistence.MapKeyEnumerated;
import java.util.List;

@RestController
@RequestMapping("/api/samochody-osobowe") //Scieżkę dopasowac pod typ dla fabryki np samachody-osobowe, samochody-ciezarowe
public class SamochodOsobowyController {

    private final static String OSOBOWE_INFO = "/info";
    private final static String OSOBOWE_WSZYSTKIE = "/pobierz";
    private final static String OSOBOWE_ZAPISZ = "/zapisz";
    private final static String OSOBOWE_TEST_TYPU_FABRYKA = "/{samochod-osobowy}/zapisz-typ";

    private SamochodOsobowySerwis samochodOsobowySerwis;

    @Autowired
    public SamochodOsobowyController(SamochodOsobowySerwis samochodOsobowySerwis) {
        this.samochodOsobowySerwis = samochodOsobowySerwis;
    }

    @GetMapping(OSOBOWE_INFO)
    public List<SamochodOsobowyOdpowiedzDTO> pobierzInfoOsobowki() {

        return samochodOsobowySerwis.pobierzSkroconeInfoSamochoduOsobowego();
    }

    @GetMapping(OSOBOWE_WSZYSTKIE)
    public List<SamochodOsobowy> pobierzSamochody() {

        return samochodOsobowySerwis.pobierzWszystkieSamochodyOsobowe();
    }

    @PostMapping(OSOBOWE_ZAPISZ)
    public ResponseEntity<SamochodOsobowyFullDTO> zapiszSamochod(@RequestBody SamochodOsobowyFullDTO samochodOsobowyFullDTO) {

        samochodOsobowySerwis.zapiszSamochodOsobowyDoBazy(samochodOsobowyFullDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(OSOBOWE_TEST_TYPU_FABRYKA)
    public ResponseEntity<SamochodOsobowyFullDTO> zapiszTypFabryka(@PathVariable (value = "samochod-osobowy") final TypPojazduENUM typPojazdu, @RequestBody SamochodOsobowyFullDTO samochodOsobowyFullDTO) {

        samochodOsobowySerwis.zapiszSamochodOsobowyFabryka(typPojazdu, samochodOsobowyFullDTO);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
