package oo2.ejercicio10_AdministradorDeProyectos;

public abstract class Etapa {

	private Proyecto proyecto;
	
	public Etapa(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	public Proyecto getProyecto() {
		return this.proyecto;
	}
	
	public abstract void aprobarEtapa();
	
	public abstract boolean modificarMargenDeGanancias(double margenNuevo);
}
