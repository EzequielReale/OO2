package oo2.ejercicio4_Topografias;

public class Pantano extends TopografiaAtomica {

	@Override
	public double calcularProporcionAgua() {
		return 0.7;
	}

	@Override
	public double calcularProporcionTierra() {
		return 0.3;
	}
}
