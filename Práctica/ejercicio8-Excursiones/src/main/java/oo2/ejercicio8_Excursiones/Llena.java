package oo2.ejercicio8_Excursiones;

public class Llena extends Situacion {

	public Llena(Excursion contexto) {
		super(contexto);
	}

	@Override
	public void inscribir(Usuario usuario) {
		this.getContexto().agregarEspera(usuario);
	}

	@Override
	public String toString() {
		return "";
	}
}
