package com.ucreativa;

public class Main {

	public static void main(String[] args) {
		Arbol miArbol = new Arbol("ArbolitusBonitus", "Comediante", 12, "Arbol bonito", "Alto", "Verde");
		miArbol.ensayar();
		miArbol.germinar();
		
		Profesor miPersona = new Profesor("Profesor X", 48, "X-9383", "profX@mail.com", 12, 8000.0);
		miPersona.actuar();
		miPersona.calificarEstudiantexs();
		
		Coche miCoche = new Coche("Juan", "Apagado", false, "Burago", "Rojo", "2010");
		miCoche.arrancar();
		miCoche.avanzar();
		miCoche.estarInerte();
		miCoche.ensayar();
	}

}
