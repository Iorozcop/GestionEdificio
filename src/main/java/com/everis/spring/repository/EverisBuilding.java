package com.everis.spring.repository;

/**
 * Clase "Repositorio / Entidad" del edificio.
 * 
 * @author Isabel Orozco Puerto
 * 
 * */

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Repository;

@Repository
public class EverisBuilding {
	
	/**Lista de vecinos del edificio*/
	private ArrayList<String> neighborsList = new ArrayList<String>();

	/**Lista de apartamentos de cada planta*/
	private ArrayList<String> apartaments = new ArrayList<String>(Arrays.asList("A", "B"));

	
	/**Lista de plantas del edificio*/
	private ArrayList<Integer> floors = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
	

	
	/**
	 * Constructor que recibe una lista de vecinos
	 * @param neighborsList
	 */
	public EverisBuilding(ArrayList<String> neighborsList) {
		this.neighborsList = neighborsList;
	}
	
	/**
	 * Constructor vacío
	 */
	public EverisBuilding() {	
	}
	

	//GETTER AND SETTER
	

	/**
	 * @return the neighborsList
	 */
	public ArrayList<String> getNeighborsList() {
		return neighborsList;
	}

	/**
	 * @param neighborsList the neighborsList to set
	 */
	public void setNeighborsList(ArrayList<String> neighborsList) {
		this.neighborsList = neighborsList;
	}

	/**
	 * @return the apartaments
	 */
	public ArrayList<String> getApartaments() {
		return apartaments;
	}

	/**
	 * @param apartaments the apartaments to set
	 */
	public void setApartaments(ArrayList<String> apartaments) {
		this.apartaments = apartaments;
	}

	/**
	 * @return the floors
	 */
	public ArrayList<Integer> getFloors() {
		return floors;
	}

	/**
	 * @param floors the floors to set
	 */
	public void setFloors(ArrayList<Integer> floors) {
		this.floors = floors;
	}
	

	
}
