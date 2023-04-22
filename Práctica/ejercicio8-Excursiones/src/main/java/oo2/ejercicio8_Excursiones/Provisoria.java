package oo2.ejercicio8_Excursiones;

public class Provisoria extends Situacion {

	public Provisoria(Excursion contexto) {
		super(contexto);
	}

	@Override
	public void inscribir(Usuario usuario) {
		this.getContexto().agregarInscripto(usuario);
		if (this.getContexto().estaDefinitiva())
			this.getContexto().setEstado(new Definitiva(this.getContexto()));
	}

	@Override
	public String toString() {
		return "Faltantes para cupo mínimo: " + this.getContexto().getFaltantesParaCupoMinimo();
	}
}
