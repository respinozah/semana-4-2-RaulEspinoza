/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
 class Vegetal {
	
	private String nombre;
	private String tipo;
	private String color;
	

	public Vegetal(String nombre, String tipo, String color) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.color = color;
	}
	
	
	public void germinar() {
		System.out.println("Vegetal: El vegetal esta germinando.");
	} 
	
	public void vegetar() {
		
		System.out.println("Vegetal: vegetando.");
	}
	
	public void florear() {
		System.out.println("Vegetal: El vegetal esta floreando.");
	}
	
	@Override
	public String toString() {
		return "Vegetal: Este vegetal es " + nombre + ", de tipo " + tipo + " y de color " + color + ".";
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}