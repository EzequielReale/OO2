package oo2.ejercicio10_AdministradorDeProyectos;

public class EnEvaluacion extends Etapa {

	public EnEvaluacion(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
		this.getProyecto().setEtapa(new Confirmada(this.getProyecto()));
	}

	@Override
	public boolean modificarMargenDeGanancias(double margenNuevo) {
		return margenNuevo >= 0.11 && margenNuevo <= 0.15; 
	}
}
