package com.ucreativa;

public class Coche extends Vehiculo {
		
	private String duennio;
	private String estadoMotor;
	private boolean luces;
	public Coche(String duennio, String estadoMotor, boolean luces, String marca, String color, String annio) {
		super();
		super.setMarca(marca);
		super.setColor(color);
		super.setAnnio(annio);
		this.duennio = duennio;
		this.estadoMotor = estadoMotor;
		this.luces = luces;
	}
	
	public void arrancar() {
		estadoMotor = "Encendido";
		System.out.println("Coche: El motor del coche esta encendido.");
	}
	
	public void apagar() {
		estadoMotor = "Apagado";
		System.out.println("Coche: El motor del coche esta apagado.");
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
	
	@Override
	public void avanzar() {
		System.out.println("Coche: El coche esta avanzando.");
	}
	
	@Override
	public void detener() {
		System.out.println("Coche: El coche se esta deteniendo.");
	}
	
	@Override
	public String toString() {
		return "Coche: Este es un coche marca " + super.getMarca() + " del annio "+super.getAnnio()+" y el duenio es "+duennio+". En este momento el motor esta "+estadoMotor+" y las luces "+luces+".";
	}
	
	public String getDuennio() {
		return duennio;
	}
	public void setDuennio(String duennio) {
		this.duennio = duennio;
	}
	public String getEstadoMotor() {
		return estadoMotor;
	}
	public void setEstadoMotor(String estadoMotor) {
		this.estadoMotor = estadoMotor;
	}
	public boolean isLuces() {
		return luces;
	}
	public void setLuces(boolean luces) {
		this.luces = luces;
	}
}