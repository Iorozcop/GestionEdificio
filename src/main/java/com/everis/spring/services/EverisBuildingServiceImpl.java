package com.everis.spring.services;

/**
 * Clase para implementar los métodos de la interface
 * 
 * @author Isabel Orozco Puerto
 * 
 * */

import org.springframework.stereotype.Service;

import com.everis.spring.repository.EverisBuilding;


@Service
public class EverisBuildingServiceImpl implements EverisBuildingServiceI{
	
	EverisBuilding building = new EverisBuilding();
	
	
	public void neightborList() {
		System.out.println("Los vecinos que viven en el edificio son: ");
		 for (String neighbor : building.getNeighborsList()) {
			System.out.println(neighbor);
		}
		
	}

	@Override
	public void search(String name) {
		
		boolean check =false;
		
		for (String neighbor : building.getNeighborsList()) {
			if(neighbor.equals(name)) {
				check=true;
			}
		}
		
		if(check) {
			System.out.println(name + " vive en el edificio.");
		}else {
			System.out.println(name + " no vive en el edificio.");
		}
	}


	@Override
	public void addNeightbor(String name, int floor, String apartament) {
		
			if(floor <=0 || floor >3) {
				System.out.println("Lo siento " + name + ", esa planta no existe");
			}else if(apartament != "A" && apartament != "B") {
				System.out.println("Lo siento " + name + ", ese apartamento no existe");
			}else {
				building.getNeighborsList().add(name);
			}
	}
	
}
