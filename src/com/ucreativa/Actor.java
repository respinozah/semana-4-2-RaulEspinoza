/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public interface Actor {
	public static String nombre = "";
	public static int experiencia = 0;
	public static String tipo = "";
	
	abstract void actuar();
	
	abstract void ensayar();			
	
	abstract void saludar();
}