package oo2.ejercicio8_Excursiones;

public abstract class Situacion {

	private Excursion contexto;
	
	
	public Situacion(Excursion contexto) {
		this.contexto = contexto;
	}
	
	public Excursion getContexto() {
		return this.contexto;
	}

	public abstract void inscribir(Usuario usuario);
	
	@Override
	public abstract String toString();
}
