package oo2.ejercicio18_SubteWay;

public class VeganSandwichBuilder extends Builder {

	@Override
	public void setBread() {
		this.sandwich.setBread(new Ingredient("Integral", 100));
	}

	@Override
	public void setMain() {
		this.sandwich.setMain(new Ingredient("Milanesa de Girgolas", 500));
	}

	@Override
	public void setSauce() {
		this.sandwich.setSauce(new Ingredient("Salsa criolla", 20));
	}

	@Override
	public void setAdditional() {
		this.sandwich.setAdditional(new Ingredient("", 0));
	}
}
