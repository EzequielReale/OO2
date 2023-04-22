package oo2.ejercicio6_Sueldos;

public class Planta extends EmpleadoFormado {

	private int antiguedad;
	
	
	public Planta(boolean casado, int cantHijos, int antiguedad) {
		super(casado, cantHijos);
		this.antiguedad = antiguedad;
	}

	@Override
	protected double sueldoBasico() {
		return 50000;
	}

	@Override
	protected double sueldoAdicional() {
		return super.sueldoAdicional() + 2000 * this.antiguedad;
	}
}
