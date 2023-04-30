package OO2.ejercicio19_PersonajesDeJuegosDeRol.Personajes;

import java.util.List;

import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armaduras.Armadura;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armas.Arma;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Habilidades.Habilidad;

public abstract class Personaje {

	private String nombre;
	private int salud;
	private Arma arma;
	private Armadura armadura;
	private List<Habilidad> habilidades;
	
	public Personaje(String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		this.nombre = nombre;
		this.salud = 100;
		this.arma = arma;
		this.armadura = armadura;
		this.habilidades = habilidades;
	}

	public boolean isAlive() {
		return this.salud > 0;
	}
	
	public int getSalud() {
		return this.salud;
	}
	
	public void atacar(Personaje enemigo) {
		if (this.isAlive()) {
			enemigo.recibirAtaque(this.arma);
		}
	}
	
	public void recibirAtaque(Arma arma) {
		if (this.isAlive()) {
			this.salud -= arma.getDañoInflingido(this.armadura);
		}
	}
}
