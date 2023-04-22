package oo2.ejercicio12_DecodificadorDePeliculas;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String titulo;
	private Year añoEstreno;
	private double puntaje;
	private List<Pelicula> peliculasSimilares;
	
	
	public Pelicula(String titulo, double puntaje, Year añoEstreno) {
		super();
		this.titulo = titulo;
		this.añoEstreno = añoEstreno;
		this.puntaje = puntaje;
		this.peliculasSimilares = new ArrayList<>();
	}

	Year getAñoEstreno() {
		return añoEstreno;
	}

	double getPuntaje() {
		return puntaje;
	}

	List<Pelicula> getPeliculasSimilares() {
		return peliculasSimilares;
	}

	public void agregarPeliculaSimilar(Pelicula pelicula) {
		if (!this.peliculasSimilares.contains(pelicula)) {
			this.peliculasSimilares.add(pelicula);
			pelicula.agregarPeliculaSimilar(this);
		}
	}
	
	int soyMasReciente(Pelicula pelicula) {
		return this.añoEstreno.compareTo(pelicula.getAñoEstreno());
	}
	
	int tengoMasPuntaje(Pelicula pelicula) {
		int resPuntaje = Double.compare(this.puntaje, pelicula.getPuntaje());
		if (resPuntaje == 0) resPuntaje = this.soyMasReciente(pelicula);
		return resPuntaje;
	}
}
