package oo2.ejercicio4_Topografias;

public abstract class TopografiaAtomica extends Topografia {
	
	@Override
	protected boolean esCompuesta(Topografia otro) {
		return false;
	}
	
	@Override
	protected boolean esSimple(Topografia otra) {
		return this.calcularProporcionAgua() == otra.calcularProporcionAgua();
	}
	
	@Override
	public boolean equals(Topografia otra) {
		return otra.esSimple(this);
	}
}
