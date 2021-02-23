package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public abstract class Persona implements Actor {
	
	public String nombre;
	public String identificacion;
	public int edad;
	

	@Override
	public void actuar() {
		// TODO Auto-generated method stub
		System.out.println("Persona: estoy actuando.");
	}

	@Override
	public void ensayar() {
		// TODO Auto-generated method stub
		System.out.println("Persona: estoy ensayando.");
	}

	@Override
	public void saludar() {
		System.out.println("Persona: Soy " + nombre + ", mi identificacion es " + identificacion + ".");
	}
	
	public void recibirOvacion() {
		System.out.println("Persona: Recibiendo ovacion");
	}
	
	public void leer() {
		System.out.println("Persona: Estoy leyendo.");
	}

	@Override
	public String toString() {
		return "Persona: Esta es la persona " + nombre + " con identificacion " + identificacion + ".";
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}