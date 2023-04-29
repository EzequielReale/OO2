package oo2.ejercicio18_SubteWay;

public class SandwichBuilder implements Builder {

	Ingrediente pan, principal, aderezo, adicional;

	@Override
	public void setPan(Ingrediente pan) {
		this.pan = pan;
	}

	@Override
	public void setPrincipal(Ingrediente principal) {
		this.principal = principal;
	}

	@Override
	public void setAderezo(Ingrediente aderezo) {
		this.aderezo = aderezo;
	}

	@Override
	public void setAdicional(Ingrediente adicional) {
		this.adicional = adicional;
	}
	
	public Sandwich getResult() {
		return new Sandwich(this.pan, this.principal, this.aderezo, this.adicional);
	}
}
