package oo2.ejercicio18_SubteWay;

public class ClassicSandwichBuilder extends Builder {

	@Override
	public void setBread() {
		this.sandwich.setBread(new Ingredient("Brioche", 100));
	}

	@Override
	public void setMain() {
		this.sandwich.setMain(new Ingredient("Ternera", 300));
	}

	@Override
	public void setSauce() {
		this.sandwich.setSauce(new Ingredient("Mayonesa", 20));
	}

	@Override
	public void setAdditional() {
		this.sandwich.setAdditional(new Ingredient("Tomate", 80));
	}
}
