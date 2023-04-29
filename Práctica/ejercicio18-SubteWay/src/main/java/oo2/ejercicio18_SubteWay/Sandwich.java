package oo2.ejercicio18_SubteWay;

public class Sandwich {

	Ingrediente pan, principal, aderezo, adicional;

	
	public Sandwich(Ingrediente pan, Ingrediente principal, Ingrediente aderezo, Ingrediente adicional) {
		this.pan = pan;
		this.principal = principal;
		this.aderezo = aderezo;
		this.adicional = adicional;
	}

	public Ingrediente getPan() {
		return pan;
	}

	public Ingrediente getPrincipal() {
		return principal;
	}

	public Ingrediente getAderezo() {
		return aderezo;
	}

	public Ingrediente getAdicional() {
		return adicional;
	}
	
	public double getPrice() {
		return this.pan.getPrecio() + this.principal.getPrecio() + this.aderezo.getPrecio() + this.adicional.getPrecio();
	}
}
