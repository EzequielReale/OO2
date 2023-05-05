package OO2.ejercicio19_PersonajesDeJuegosDeRol.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armaduras.ArmaduraDeHierro;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armas.Martillo;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Habilidades.ADistancia;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Habilidades.Habilidad;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Habilidades.LanzarRayos;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Personajes.Personaje;

public class ThoorCreator extends Factory {

	@Override
	public Personaje crearPersonaje(String nombre) {
		List<Habilidad> habilidades = new ArrayList<>();
		habilidades.add(new LanzarRayos()); habilidades.add(new ADistancia());
		return new Personaje(nombre, new ArmaduraDeHierro(), new Martillo(), habilidades);
	}
}
