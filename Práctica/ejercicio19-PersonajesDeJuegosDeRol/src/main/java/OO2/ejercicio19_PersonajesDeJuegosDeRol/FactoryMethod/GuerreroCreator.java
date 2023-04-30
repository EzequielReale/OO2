package OO2.ejercicio19_PersonajesDeJuegosDeRol.FactoryMethod;

import java.util.List;
import java.util.ArrayList;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Personajes.*;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armaduras.*;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armas.*;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Habilidades.*;

public class GuerreroCreator extends Factory {

	@Override
	public Personaje crearPersonaje(String nombre) {
		List<Habilidad> habilidades = new ArrayList<>();
		habilidades.add(new CuerpoACuerpo());
		return new Guerrero(nombre, new ArmaduraDeAcero(), new Espada(), habilidades);
	}
}
