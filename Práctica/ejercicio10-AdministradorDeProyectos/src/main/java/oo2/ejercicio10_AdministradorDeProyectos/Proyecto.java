package oo2.ejercicio10_AdministradorDeProyectos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {

	private LocalDate inicio, fin;
	private String nombre, objetivo;
	private int cantIntegrantes;
	private double sueldoPorIntegrante, margenGanancia;
	private Etapa etapa;
	
	
	public Proyecto(String nombre, LocalDate inicio, LocalDate fin, String objetivo,
			int cantIntegrantes, double sueldoPorIntegrante) {
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.cantIntegrantes = cantIntegrantes;
		this.sueldoPorIntegrante = sueldoPorIntegrante;
		this.margenGanancia = 0.07;
		this.etapa = new EnConstruccion(this);
	}

	public Etapa getEtapa() {
		return etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public int getCantIntegrantes() {
		return cantIntegrantes;
	}

	public double getSueldoPorIntegrante() {
		return sueldoPorIntegrante;
	}

	public double getMargenGanancia() {
		return margenGanancia;
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa();
	}
	
	public double costoProyecto() {
		return this.cantIntegrantes * this.sueldoPorIntegrante * ChronoUnit.DAYS.between(this.inicio, this.fin);
	}
	
	public double precioProyecto() {
		return this.costoProyecto() + this.costoProyecto() * this.margenGanancia;
	}
	
	public void modificarMargenDeGanancias(double margenNuevo) {
		if (this.etapa.modificarMargenDeGanancias(margenNuevo))
			this.margenGanancia = margenNuevo;
	}
	
	public void cancelarProyecto() {
		if (!this.objetivo.contains("(Cancelado)"))
			this.objetivo += " (Cancelado)";
	}
}
