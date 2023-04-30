package OO2.ejercicio19_PersonajesDeJuegosDeRol.Armaduras;

public class ArmaduraDeCuero implements Armadura {

	@Override
	public int getDañoRecibidoPorEspada() {
		return 8;
	}

	@Override
	public int getDañoRecibidoPorArco() {
		return 5;
	}
	@Override
	public int getDañoRecibidoPorBaston() {
		return 2;
	}

	@Override
	public int getDañoRecibidoPorMartillo() {
		return 11;
	}

}
