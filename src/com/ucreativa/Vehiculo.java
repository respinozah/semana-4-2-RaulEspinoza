/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public class Vehiculo implements Actor, ObjetoInerte {

	private String marca;
	private String color;
	private String annio;
	/**
	 * 
	 */
	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}
	

	public Vehiculo(String marca, String color, String annio) {
		this.marca = marca;
		this.color = color;
		this.annio = annio;
	}


	@Override
	public void actuar() {
		System.out.println("Vehiculo: esta actuando porque implementa Actor.");
	}

	@Override
	public void ensayar() {
		System.out.println("Vehiculo: esta ensayando porque implementa Actor.");
	}

	@Override
	public void saludar() {
		System.out.println("Vehiculo: esta saludando porque implementa Actor.");
	}
	
	@Override
	public void estarInerte() {
		System.out.println("Vehiculo: esta inerte porque implementa ObjetoInerte.");
	}
	
	public void avanzar() {
		System.out.println("Vehiculo: El vehiculo esta avanzando.");
	}
	
	public void detener() {
		System.out.println("Vehiculo: El vehiculo se esta deteniendo.");
	}
	
	@Override
	public String toString() {
		return "Vehiculo: Este es un vehiculo marca " + marca + ", color " + color + " y es del annio " + color + ".";
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getAnnio() {
		return annio;
	}


	public void setAnnio(String annio) {
		this.annio = annio;
	}
	
		
}