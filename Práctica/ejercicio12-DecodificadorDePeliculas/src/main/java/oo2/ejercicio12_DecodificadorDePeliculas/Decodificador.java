package oo2.ejercicio12_DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	private List<Pelicula> grillaDePeliculas, peliculasReproducidas;
	private Sugerencia criterioDeSugerencia;
	
	
	public Decodificador() {
		this.grillaDePeliculas = new ArrayList<>();
		this.peliculasReproducidas = new ArrayList<>();
		this.criterioDeSugerencia = new SugerenciaReciente();
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		this.grillaDePeliculas.add(pelicula);
	}
	
	public void reproducirPelicula(Pelicula pelicula) {
		this.peliculasReproducidas.add(pelicula);
	}
	
	List<Pelicula> getGrillaDePeliculas() {
		return this.grillaDePeliculas;
	}
	
	List<Pelicula> getPeliculasReproducidas() {
		return this.peliculasReproducidas;
	}
	
	public void cambiarCriterioDeSugerencia(Sugerencia s) {
		this.criterioDeSugerencia = s;
	}
	
	public List<Pelicula> sugerirPeliculas() {
		return this.criterioDeSugerencia.sugerirPelicula(this);
	}
}
