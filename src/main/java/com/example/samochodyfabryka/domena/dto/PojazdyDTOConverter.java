package com.example.samochodyfabryka.domena.dto;

import com.example.samochodyfabryka.domena.SamochodOsobowy;
import com.example.samochodyfabryka.fabryka.Pojazdy;
import com.example.samochodyfabryka.repozytorium.SamochodOsobowyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PojazdyDTOConverter {

    private SamochodOsobowyRepo samochodOsobowyRepo;

    @Autowired
    public PojazdyDTOConverter(SamochodOsobowyRepo samochodOsobowyRepo) {
        this.samochodOsobowyRepo = samochodOsobowyRepo;
    }


    public List<SamochodOsobowyOdpowiedzDTO> konwertujDoDTO() {

        return samochodOsobowyRepo.findAll()
                .stream()
                .map(samochodOsobowy -> new SamochodOsobowyOdpowiedzDTO(samochodOsobowy.getMarka(), samochodOsobowy.getIloscMiejsc()))
                .collect(Collectors.toList());

    }

    public SamochodOsobowy konwertujDoOsobowki(SamochodOsobowyFullDTO samochodOsobowyFullDTO) {

        SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
        samochodOsobowy.setMarka(samochodOsobowyFullDTO.getMarka());
        samochodOsobowy.setModel(samochodOsobowyFullDTO.getModel());
        samochodOsobowy.setPrzebieg(samochodOsobowyFullDTO.getPrzebieg());
        samochodOsobowy.setCena(samochodOsobowyFullDTO.getCena());
        samochodOsobowy.setIloscMiejsc(samochodOsobowyFullDTO.getIloscMiejsc());

        return samochodOsobowy;

    }
}
