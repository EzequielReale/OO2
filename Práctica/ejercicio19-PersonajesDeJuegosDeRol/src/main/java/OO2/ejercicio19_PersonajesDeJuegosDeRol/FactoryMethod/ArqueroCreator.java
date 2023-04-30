package OO2.ejercicio19_PersonajesDeJuegosDeRol.FactoryMethod;

import java.util.List;
import java.util.ArrayList;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Personajes.*;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armaduras.*;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armas.*;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Habilidades.*;

public class ArqueroCreator extends Factory{

	@Override
	public Personaje crearPersonaje(String nombre) {
		List<Habilidad> habilidades = new ArrayList<>();
		habilidades.add(new ADistancia());
		return new Arquero(nombre, new ArmaduraDeCuero(), new Arco(), habilidades);
	}
}
