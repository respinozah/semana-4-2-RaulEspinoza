package com.ucreativa;

public class Arbusto extends Vegetal implements Actor{

	private String nombreCientifico;
	private String nombreComun;
	private String esDeJardin;
	private int edad;
	

	public Arbusto(String nombreCientifico, String nombreComun, int edad, String nombreVegetal, String tipo, String color) {
		super(nombreVegetal, tipo, color);
		this.nombreCientifico = nombreCientifico;
		this.nombreComun = nombreComun;
		this.edad = edad;
	}

	@Override
	public void actuar() {
		System.out.println("Arbusto: El arbusto actua porque implementa Actor.");
	}
	
	@Override
	public void ensayar() {
		System.out.println("Arbusto: El arbusto ensaya porque implementa Actor.");
	}
	
	@Override
	public void saludar() {
		System.out.println("Arbusto: El arbusto saluda porque implementa Actor.");
	}
	
	@Override
	public void germinar() {
		System.out.println("Arbusto: El arbusto esta germinando.");
	} 
	
	public void adornarJardin() {
		System.out.println("Arbusto: El arbusto esta adornando el jardin.");
	}
	
	@Override
	public String toString() {
		return "Arbusto: Este es un " + nombreCientifico + ", conocido como " + nombreComun + " y tiene " + edad + " annios.";
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

	public String getEsDeJardin() {
		return esDeJardin;
	}

	public void setEsDeJardin(String esDeJardin) {
		this.esDeJardin = esDeJardin;
	}
}
