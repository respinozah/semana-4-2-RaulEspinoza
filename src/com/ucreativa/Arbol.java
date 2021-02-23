package com.ucreativa;

public class Arbol extends Vegetal implements Actor{

	private String nombreCientifico;
	private String nombreComun;
	private int edad;
	

	public Arbol(String nombreCientifico, String nombreComun, int edad, String nombreVegetal, String tipo, String color) {
		super(nombreVegetal, tipo, color);
		this.nombreCientifico = nombreCientifico;
		this.nombreComun = nombreComun;
		this.edad = edad;
	}

	public void darSombra() {
		System.out.println("Arbol: El arbol da sombra.");
	}
	
	public void darFrutos() {
		System.out.println("Arbol: El arbol da frutos.");
	}
	
	@Override
	public void actuar() {
		System.out.println("Arbol: El arbol actua porque implementa Actor.");
	}
	
	@Override
	public void ensayar() {
		System.out.println("Arbol: El arbol ensaya porque implementa Actor.");
	}
	
	@Override
	public void saludar() {
		System.out.println("Arbol: El arbol saluda porque implementa Actor.");
	}
	
	@Override
	public void germinar() {
		System.out.println("Arbol: El arbol esta germinando.");
	} 
	@Override
	public String toString() {
		return "Arbol: Este es un " + nombreCientifico + ", conocido como " + nombreComun + " y tiene " + edad + " annios.";
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}


	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}


	public String getNombreComun() {
		return nombreComun;
	}


	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
}
