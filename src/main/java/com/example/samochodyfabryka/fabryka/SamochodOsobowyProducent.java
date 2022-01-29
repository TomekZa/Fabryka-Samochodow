package com.example.samochodyfabryka.fabryka;

import com.example.samochodyfabryka.domena.SamochodOsobowy;
import com.example.samochodyfabryka.domena.dto.PojazdyDTOConverter;
import com.example.samochodyfabryka.domena.dto.SamochodOsobowyFullDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.transaction.Transactional;

@Service
@Transactional
public class SamochodOsobowyProducent implements PojazdFabryka<SamochodOsobowyFullDTO> {

   @Autowired
    private PojazdyDTOConverter pojazdyDTOConverter;

  // private static final String OSOBOWY_T = TypPojazduENUM.OSOBOWY.getTypPojazdu();
//    private  final String SAMOCHOD_CIEZAROWY = TypPojazduENUM.CIEZAROWY.getTypPojazdu();
  //  private final TypPojazduENUM OSOBOWY;
    //private  final String CIEZAROWY;

    @Autowired
    private SamochodOsobowyFullDTO samochodOsobowyFullDTO;


//    @Override
//    public Pojazdy utworzPojazd() {
//        return null;
//    }



//    @Override
//    public Pojazdy utworzPojazd(SamochodOsobowyFullDTO samochodOsobowyFullDTO) {
//
//        SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
//        samochodOsobowy.setMarka(samochodOsobowyFullDTO.getMarka());
//        samochodOsobowy.setModel(samochodOsobowyFullDTO.getModel());
//        samochodOsobowy.setPrzebieg(samochodOsobowyFullDTO.getPrzebieg());
//        samochodOsobowy.setCena(samochodOsobowyFullDTO.getCena());
//        samochodOsobowy.setIloscMiejsc(samochodOsobowyFullDTO.getIloscMiejsc());
//
//        return samochodOsobowy;
//    }

//    public SamochodOsobowy utworzSamochodOsobowy(SamochodOsobowyFullDTO samochodOsobowyFullDTO){
//        return utworzPojazd();
//    }




//    @Override
//    public Pojazdy utworzPojazd(TypPojazduENUM typPojazdu, Pojazdy pojazd) {
//
//        switch (typPojazdu) {
//
//            case OSOBOWY:
//                SamochodOsobowyFullDTO samochodOsobowyFullDTO = new SamochodOsobowyFullDTO(pojazd);
//                pojazdyDTOConverter.konwertujDoOsobowki((SamochodOsobowyFullDTO) pojazd);
//
//            case CIEZAROWY:
//                return null;
//
//            default:
//                throw new UnsupportedOperationException("Niepoprawny typ");
//        }
//    }


//    @Override
//        public Pojazdy utworzPojazd() {
//
//        SamochodOsobowy samochodOsobowy = new SamochodOsobowy();
//
//        return samochodOsobowy; // poprawić metodę fabryki
//        }

    public SamochodOsobowy utworzPojazdStatycznie() {

        return tworzenieOsobowkiStatycznie("Audi", "A8", "280000", 42000, 5);
    }

    private SamochodOsobowy tworzenieOsobowkiStatycznie(String marka, String model, String przebieg, int cena, int iloscMiejsc) {

        SamochodOsobowy samochodOsobowy = new SamochodOsobowy(marka, model, przebieg, cena, iloscMiejsc);
        samochodOsobowy.setMarka(marka);
        samochodOsobowy.setModel(model);
        samochodOsobowy.setPrzebieg(przebieg);
        samochodOsobowy.setCena(cena);
        samochodOsobowy.setIloscMiejsc(iloscMiejsc);

        return samochodOsobowy;
    }

    @Override
    public Pojazdy utworzPojazd(SamochodOsobowyFullDTO pojazd,TypPojazduENUM typPojazduENUM) {
       // TypPojazduENUM OSOBOWY_T = TypPojazduENUM.valueOf(typPojazduENUM);


        switch (typPojazduENUM) {

            case OSOBOWY:
                this.samochodOsobowyFullDTO = new SamochodOsobowyFullDTO(pojazd); //nie wspierane przez Java 11

            case CIEZAROWY:
                return null;

            default:
                throw new UnsupportedOperationException("Niepoprawny typ");
        }
    }

    public SamochodOsobowy zapiszDoBazyNowySamochod() {
        return pojazdyDTOConverter.konwertujDoOsobowki(this.samochodOsobowyFullDTO);
    }

//        public List<SamochodOsobowyOdpowiedzDTO> pobierzInfo(){
//        PojazdyDTOConverter pojazdyDTOConverter = ;//poprawić żeby było w konsoli
//            return new PojazdyDTOConverter().konwertujDoDTO();
//        }

//    @InitBinder
//    public void initBinder(WebDataBinder dataBinder) {
//        dataBinder.registerCustomEditor(TypPojazduENUM.class, new TypPojazduConverter());
//    }
}
