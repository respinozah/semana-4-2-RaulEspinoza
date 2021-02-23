/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public class Estudiante extends Persona {

	private String nivel;
	private String carne;
	private String horario;
	/**
	 * 
	 */
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	public Estudiante(String nombre, int edad, String identificacion, String nivel, String carne, String horario) {
		super();
		super.edad = edad;
		super.nombre = nombre;
		super.identificacion = identificacion;
		this.nivel = nivel;
		this.carne = carne;
		this.horario = horario;
	}
	
	public void estudiar() {
		System.out.println("Estudiante: " + super.getNombre() + " esta estudiando.");
	}
	
	public void recibirLeccion() {
		System.out.println("Estudiante: " + super.getNombre() + " esta recibiendo una leccion.");
	}
	
	public void hacerExamen() {
		System.out.println("Estudiante: " + super.getNombre() + " esta haciendo un examen.");
	}
	
	@Override
	public String toString() {
		return "Estudiante: Este es el estudiante " + super.getNombre() + ", con la identificacion " + super.getIdentificacion() + " y el carne " + carne + ". Esta en nivel " + nivel + " en el horario " + horario + ".";
	}
	
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
}