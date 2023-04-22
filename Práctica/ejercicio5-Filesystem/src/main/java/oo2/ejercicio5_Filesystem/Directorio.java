package oo2.ejercicio5_Filesystem;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Directorio extends Archivo {
	
	private Set<Archivo> contenido;

	
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion, 32);
		this.contenido = new HashSet<>();
	}
	
	public void agregar(Archivo archivo) {
		this.contenido.add(archivo);
	}
	
	@Override
	public double tamañoTotalOcupado() {
		return super.tamañoTotalOcupado() + this.contenido.stream()
				.mapToDouble(a->a.tamañoTotalOcupado())
				.sum();
	}
	
	@Override
	public Archivo archivoMasGrande() {
		return this.contenido.stream()
				.map(a->a.archivoMasGrande())
				.max((a1, a2)->Double.compare(a1.tamañoTotalOcupado(), a2.tamañoTotalOcupado()))
				.orElse(null);
	}
	
	@Override
	public Archivo archivoMasNuevo() {
		return this.contenido.stream()
				.map(a->a.archivoMasNuevo())
				.max((a1, a2)->a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
				.orElse(null);
	}
}
