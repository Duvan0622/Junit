package com.junit.vehiculo;

public class Vehiculo {
	public int velocidad;
	public boolean avanza;
	public double distancia;
	
	public Vehiculo(int velocidad) {
		this.velocidad = velocidad;
		this.avanza = false;
		this.distancia = 0.0;
	};
	
	public void setAvanza() {
		this.avanza = !(this.avanza);
	};
	
	public void avanzar(int tiempo) {
		if(avanza) {
			this.distancia = velocidad * tiempo;
			System.out.println("El vehículo ha avanzado " + this.distancia + " unidades de distancia.");
		}else{
			System.out.println("El vehículo no puede avanzar porque está detenido.");
		};
		
	};
	
	public void cambiarVelocidad(int velocidad) {
		this.velocidad = velocidad;
	};
	
	public void frenar() {
		if (avanza) {
            avanza = false;
            System.out.println("El vehículo ha frenado.");
        } else {
            System.out.println("El vehículo ya está detenido.");
        }
	};
}
