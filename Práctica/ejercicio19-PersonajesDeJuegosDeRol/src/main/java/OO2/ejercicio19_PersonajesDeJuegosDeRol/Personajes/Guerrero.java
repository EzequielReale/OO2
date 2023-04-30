package OO2.ejercicio19_PersonajesDeJuegosDeRol.Personajes;

import java.util.List;

import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armaduras.Armadura;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armas.Arma;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Habilidades.Habilidad;

public class Guerrero extends Personaje {

	public Guerrero(String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre, armadura, arma, habilidades);
	}
}
