package com.everis.spring.services;

/**
 * Interface donde aparecen los métodos que vamos a usar
 * 
 * @author Isabel Orozco Puerto
 * 
 * */

public interface EverisBuildingServiceI {

	
	/**
	 * Método que añade un vecino al edificio pasándole por parámetro su nombre, planta y apartamento
	 * @param String name
	 * @param int floor
	 * @param String apartament
	 */
	public void addNeightbor(String name, int floor, String apartament);
	
	/**
	 * Método que saca una lista de los vecinos del edificio
	 */
	public void neightborList();
	
	/**
	 * Método que busca si un vecino vive en el edificio según el nombre que recibe por parámetro
	 * @param String name
	 */
	public void search(String name);
}
