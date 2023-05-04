package oo2.ejercicio18_SubteWay;

public class Sandwich {

	private Ingredient bread, main, sauce, additional;

	
	public Sandwich(Ingredient bread, Ingredient main, Ingredient sauce, Ingredient additional) {
		this.bread = bread;
		this.main = main;
		this.sauce = sauce;
		this.additional = additional;
	}

	public Ingredient getBread() {
		return bread;
	}

	public Ingredient getMain() {
		return main;
	}

	public Ingredient getSauce() {
		return sauce;
	}

	public Ingredient getAdditional() {
		return additional;
	}
	
	public double getPrice() {
		return this.bread.getPrice() + this.main.getPrice() + this.sauce.getPrice() + this.additional.getPrice();
	}
}
