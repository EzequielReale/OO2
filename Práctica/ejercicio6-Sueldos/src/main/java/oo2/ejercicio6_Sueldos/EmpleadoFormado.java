package oo2.ejercicio6_Sueldos;

public abstract class EmpleadoFormado extends Empleado {

	private boolean casado;
	private int cantHijos;
	
	
	public EmpleadoFormado(boolean casado, int cantHijos) {
		this.casado = casado;
		this.cantHijos = cantHijos;
	}

	private double primaPorCasamiento() {
		return this.casado ? 5000 : 0;
	}
	
	private double primaPorHijos() {
		return 2000 * this.cantHijos;
	}
	
	@Override
	protected double sueldoAdicional() {
		return this.primaPorCasamiento() + this.primaPorHijos();
	}
}
