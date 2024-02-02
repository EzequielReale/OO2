package oo2.ejercicio18_SubteWay;

public class VegetarianSandwichBuilder extends Builder {

	@Override
	public void setBread() {
		this.sandwich.setBread(new Ingredient("Semillas", 120));
	}

	@Override
	public void setMain() {
		this.sandwich.setMain(new Ingredient("Provoleta grillada", 200));
	}

	@Override
	public void setSauce() {
		this.sandwich.setSauce(new Ingredient("", 0));
	}

	@Override
	public void setAdditional() {
		this.sandwich.setAdditional(new Ingredient("Berenjenas al escabeche", 100));
	}
}
