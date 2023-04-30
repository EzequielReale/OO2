package OO2.ejercicio19_PersonajesDeJuegosDeRol.Armas;

import OO2.ejercicio19_PersonajesDeJuegosDeRol.Armaduras.Armadura;

public class BastonMagico implements Arma {

	@Override
	public int getDañoInflingido(Armadura armadura) {
		return armadura.getDañoRecibidoPorBaston();
	}

}
