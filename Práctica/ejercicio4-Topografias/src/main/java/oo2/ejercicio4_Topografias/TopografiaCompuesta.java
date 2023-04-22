package oo2.ejercicio4_Topografias;

import java.util.ArrayList;
import java.util.List;

public class TopografiaCompuesta extends Topografia {

	private List<Topografia> composicion;
	
	
	public TopografiaCompuesta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.composicion = new ArrayList<>();
		this.agregarTopografias(t1, t2, t3, t4);
	}
	
	private void agregarTopografias(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.composicion.add(t1);
		this.composicion.add(t2);
		this.composicion.add(t3);
		this.composicion.add(t4);
	}

	@Override
	public double calcularProporcionAgua() {
		return this.composicion.stream()
				.mapToDouble(t->t.calcularProporcionAgua())
				.sum() / 4;
	}

	@Override
	public double calcularProporcionTierra() {
		return 1 - this.calcularProporcionAgua();
	}
	
	protected boolean esSimple(Topografia otra) {
		return false;
	}
	
	protected boolean esCompuesta(Topografia otra) {
		TopografiaCompuesta comp = (TopografiaCompuesta) otra;
		return this.composicion.equals(comp.composicion);
	}
	
	public boolean equals(Topografia otra) {
		return otra.esCompuesta(this);
	}
}
