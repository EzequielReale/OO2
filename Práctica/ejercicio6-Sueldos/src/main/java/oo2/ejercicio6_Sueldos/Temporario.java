package oo2.ejercicio6_Sueldos;

public class Temporario extends EmpleadoFormado {

	private int horasTrabajo;
	
	
	public Temporario(boolean casado, int cantHijos, int horasTrabajo) {
		super(casado, cantHijos);
		this.horasTrabajo = horasTrabajo;
	}
	
	@Override
	protected double sueldoBasico() {
		return 20000 + 300 * this.horasTrabajo;
	}
}
