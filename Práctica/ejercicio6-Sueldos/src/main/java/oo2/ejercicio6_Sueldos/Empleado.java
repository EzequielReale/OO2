package oo2.ejercicio6_Sueldos;

public abstract class Empleado {

	protected abstract double sueldoBasico();
	
	protected abstract double sueldoAdicional();
	
	private double descuentoDeSueldo() {
		return this.sueldoBasico() * 0.13 + this.sueldoAdicional() * 0.05;
	}
	
	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuentoDeSueldo();
	}
}
