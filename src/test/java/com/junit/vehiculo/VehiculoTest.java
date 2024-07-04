package com.junit.vehiculo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VehiculoTest {

	@Test
	@DisplayName("Test a ver si el setAvanza funciona")
	public void setAvansaTest() {
		Vehiculo vehi = new Vehiculo(7);
		vehi.setAvanza();
		assertTrue(vehi.avanza);
	};
	
	@Test
	@DisplayName("Test a ver si avanza correctamente")
	public void avanzarTest() {
		Vehiculo vehi = new Vehiculo(7);
		vehi.setAvanza();
		vehi.avanzar(3);
		assertEquals(21, vehi.distancia);
	};
	
	@Test
	@DisplayName("Test a ver si No avanza correctamente")
	public void avanzar2Test() {
		Vehiculo vehi = new Vehiculo(7);
		vehi.avanzar(3);
		assertEquals(0, vehi.distancia);
	};
	
	@Test
	@DisplayName("Test a ver si frena correctamente")
	public void frenarTest() {
		Vehiculo vehi = new Vehiculo(6);
		vehi.setAvanza();
		vehi.frenar();
		assertFalse(vehi.avanza);
	};
	
	@Test
	@Disabled("Se deshabilito la prueba")
	public void frenar2Test() {
		Vehiculo vehi = new Vehiculo(6);
		vehi.frenar();
		assertTrue(vehi.avanza);
	};

}
