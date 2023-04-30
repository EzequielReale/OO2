package OO2.ejercicio19_PersonajesDeJuegosDeRol.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armaduras.ArmaduraDeCuero;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armas.BastonMagico;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Habilidades.ADistancia;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Habilidades.Habilidad;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Habilidades.Magia;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Personajes.Mago;
import OO2.ejercicio19_PersonajesDeJuegosDeRol.Personajes.Personaje;

public class MagoCreator extends Factory {

	@Override
	public Personaje crearPersonaje(String nombre) {
		List<Habilidad> habilidades = new ArrayList<>();
		habilidades.add(new Magia()); habilidades.add(new ADistancia());
		return new Mago(nombre, new ArmaduraDeCuero(), new BastonMagico(), habilidades);
	}
}
