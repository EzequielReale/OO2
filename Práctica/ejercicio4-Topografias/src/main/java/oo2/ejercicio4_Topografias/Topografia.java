package oo2.ejercicio4_Topografias;

import java.util.ArrayList;
import java.util.List;

public abstract class Topografia {
	
	public abstract double calcularProporcionAgua();
	
	public abstract double calcularProporcionTierra();
	
	protected abstract boolean esSimple(Topografia otra);
	
	protected abstract boolean esCompuesta(Topografia otro);
	
	public abstract boolean equals(Topografia otra);
}
