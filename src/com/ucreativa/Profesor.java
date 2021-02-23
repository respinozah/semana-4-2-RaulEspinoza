/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public class Profesor extends Persona {

	
	private String correo;
	private int experiencia;
	private double salario;

	/**
	 * @param correo
	 * @param experiencia
	 * @param salario
	 */
	public Profesor(String nombre, int edad, String identificacion,String correo, int experiencia, double salario) {
		super();
		super.edad = edad;
		super.nombre = nombre;
		super.identificacion = identificacion;
		this.correo = correo;
		this.experiencia = experiencia;
		this.salario = salario;
	}

	public void planearClase() {
		System.out.println("Profesor: Planea clase.");
	}
	
	public void darClase() {
		System.out.println("Profesor: Dando clase.");
	}
	
	public void calificarEstudiantexs() {
		System.out.println("Profesor: Calificando estudiantes.");
	}

	@Override
	public String toString() {
		return "Profesor: Este es un profesor llamado " + nombre + ", su identificacion es " + identificacion + ", tienen " + edad + " de edad y " + experiencia + " de experiencia. Su salario es " + salario + " y se le puede contactar a " + correo + ".";
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
	
	