package oo2.ejercicio10_AdministradorDeProyectos;

public class Confirmada extends Etapa {

	public Confirmada(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {}

	@Override
	public boolean modificarMargenDeGanancias(double margenNuevo) {
		return false;
	}
	
}
