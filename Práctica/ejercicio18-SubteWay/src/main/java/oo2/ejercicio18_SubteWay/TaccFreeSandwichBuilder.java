package oo2.ejercicio18_SubteWay;

public class TaccFreeSandwichBuilder extends Builder {

	@Override
	public void setBread() {
		this.sandwich.setBread(new Ingredient("Chipá", 150));
	}

	@Override
	public void setMain() {
		this.sandwich.setMain(new Ingredient("Pollo", 250));
	}

	@Override
	public void setSauce() {
		this.sandwich.setSauce(new Ingredient("Salsa tártara", 18));
	}

	@Override
	public void setAdditional() {
		this.sandwich.setAdditional(new Ingredient("Verduras grilladas", 200));
	}
}
