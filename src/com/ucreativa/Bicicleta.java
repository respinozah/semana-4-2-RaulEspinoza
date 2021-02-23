package com.ucreativa;

public class Bicicleta extends Vehiculo{

	private String duennio;
	private String esDeVelocidades;
	private boolean luces;
	
	public Bicicleta(String duennio, String esDeVelocidades, boolean luces, String marca, String color, String annio) {
		super();
		super.setMarca(marca);
		super.setColor(color);
		super.setAnnio(annio);
		this.duennio = duennio;
		this.esDeVelocidades = esDeVelocidades;
		this.luces = luces;
	}
	
	
	public void interruptorLuces()	{
		if(luces) {
			luces = false;
			System.out.println("Coche: Las luces del coche estan apagadas.");
		}else {
			luces = true;
			System.out.println("Coche: Las luces del coche estan encendidas.");
		}
	}
	
	public void rodar() {
		System.out.println("Bicicleta: La bicicleta esta rodando.");
	}
	
	@Override
	public void avanzar() {
		System.out.println("Bicicleta: La bicicleta esta avanzando.");
	}
	
	@Override
	public void detener() {
		System.out.println("Bicicleta: La bicicleta se esta deteniendo.");
	}
	
	@Override
	public String toString() {
		return "Bicicleta: Esta es una bicicleta marca " + super.getMarca() + " del annio "+super.getAnnio()+" y el duenio es "+duennio+". "
				+ "Tiene cambios "+esDeVelocidades+" y las luces "+luces+".";
	}
	

}