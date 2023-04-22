package oo2.ejercicio6_Sueldos;

public class Pasante extends Empleado {

	private int examenesRendidos;
	
	
	public Pasante(int examenesRendidos) {
		this.examenesRendidos = examenesRendidos;
	}
	
	@Override
	protected double sueldoBasico() {
		return 20000;
	}

	@Override
	protected double sueldoAdicional() {
		return 2000 * this.examenesRendidos;
	}
}
