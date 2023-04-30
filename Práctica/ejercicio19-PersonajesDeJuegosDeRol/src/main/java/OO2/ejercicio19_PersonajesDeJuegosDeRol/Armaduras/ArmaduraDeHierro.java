package OO2.ejercicio19_PersonajesDeJuegosDeRol.Armaduras;

public class ArmaduraDeHierro implements Armadura {

	@Override
	public int getDañoRecibidoPorEspada() {
		return 5;
	}

	@Override
	public int getDañoRecibidoPorArco() {
		return 3;
	}

	@Override
	public int getDañoRecibidoPorBaston() {
		return 1;
	}

	@Override
	public int getDañoRecibidoPorMartillo() {
		return 7;
	}
}
