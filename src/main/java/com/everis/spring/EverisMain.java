package com.everis.spring;

/**
 * Clase principal desde donde ejecutamos el programa y consumimos los servicios.
 * 
 * @author Isabel Orozco Puerto
 * 
 * */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.everis.spring.services.EverisBuildingServiceI;

@SpringBootApplication
public class EverisMain implements CommandLineRunner {
	/*
	 * Hemos implementado CommandLineRunner para poder crear objetos y demás desde aquí, 
	 * ya que en principio no vamos a tener un controller que pertenezca a la parte visual.
	 */

	@Autowired
	private EverisBuildingServiceI buildingService;
	
	public static void main(String[] args) {
		SpringApplication.run(EverisMain.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
	
		//consumimos los servicios
				
		//añadimos vecinos al edificio
		buildingService.addNeightbor("Monica Geller", 2, "B");	
	    buildingService.addNeightbor("Rachel Green", 2, "B");
		buildingService.addNeightbor("Joey Tribbiani", 2, "A");
		buildingService.addNeightbor("Chandler Bing", 2, "A");
		
		//prueba de planta errónea
		buildingService.addNeightbor("Ross Geller", 4, "A");
		System.out.println("-----------------------");
		
		//sacamos la lista de vecinos del edificio
		buildingService.neightborList();
		System.out.println("-----------------------");
		
		//búsqueda de vecino a través del nombre
		buildingService.search("Phoebe Buffay");
		buildingService.search("Chandler Bing");
	}

}
