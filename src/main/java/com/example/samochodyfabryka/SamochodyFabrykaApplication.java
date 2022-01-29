package com.example.samochodyfabryka;

import com.example.samochodyfabryka.domena.dto.PojazdyDTOConverter;
import com.example.samochodyfabryka.fabryka.SamochodCiezarowyProducent;
import com.example.samochodyfabryka.fabryka.SamochodOsobowyProducent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SamochodyFabrykaApplication {


	public static void main(String[] args) {
		SpringApplication.run(SamochodyFabrykaApplication.class, args);

		uruchomienieFabrykiSamochodow();


	}

	public static void uruchomienieFabrykiSamochodow(){

		SamochodOsobowyProducent samochodOsobowyProducent = new SamochodOsobowyProducent();
		System.out.println(samochodOsobowyProducent.utworzPojazdStatycznie());
		//System.out.println(samochodOsobowyProducent.pobierzInfo());


		SamochodCiezarowyProducent samochodCiezarowyProducent = new SamochodCiezarowyProducent();
		System.out.println(samochodCiezarowyProducent.utwórzPojazdStatycznie());

	}

}
