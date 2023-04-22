package oo2.ejercicio5_Filesystem;

import java.time.LocalDate;

public class Archivo {

	private String nombre;
	private LocalDate fechaCreacion;
	private double tamaño;
	
	
	public Archivo(String nombre, LocalDate fechaCreacion, double tamaño) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.tamaño = tamaño;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public double tamañoTotalOcupado() {
		return tamaño;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
}
