package oo2.ejercicio8_Excursiones;

public class Definitiva extends Situacion {

	public Definitiva(Excursion contexto) {
		super(contexto);
	}

	@Override
	public void inscribir(Usuario usuario) {
		this.getContexto().agregarInscripto(usuario);
		if (this.getContexto().estaLlena())
			this.getContexto().setEstado(new Llena(this.getContexto()));
	}

	@Override
	public String toString() {
		return "Mails inscriptos: " + this.getContexto().getMailsInscriptos()
				+ "Fatantes para cupo máximo: " +this.getContexto().getFaltantesParaCupoMaximo();
	}
}
