package com.ucreativa;

public class Main {

	public static void main(String[] args) {

		System.out.println("-------------------------------------------------------------------");
		Profesor miProfe = new Profesor("Profesor X", 48, "X-9383", "profX@mail.com", 12, 8000.0);
		miProfe.actuar();
		miProfe.calificarEstudiantexs();
		
		Persona miEstudiante = new Estudiante("Estudiante A", 18, "A-435435", "11", "Ä0-1499", "Tarde");
		miEstudiante.toString();
		miEstudiante.ensayar();
		
		
		System.out.println("-------------------------------------------------------------------");
		Coche miCoche = new Coche("Juan", "Apagado", false, "Burago", "Rojo", "2010");
		miCoche.arrancar();
		miCoche.avanzar();
		miCoche.estarInerte();
		miCoche.ensayar();
		
		System.out.println("-------------------------------------------------------------------");
		Arbol miArbol = new Arbol("ArbolitusBonitus", "Comediante", 12, "Arbol bonito", "Alto", "Verde");
		miArbol.ensayar();
		miArbol.germinar();
	}

}
