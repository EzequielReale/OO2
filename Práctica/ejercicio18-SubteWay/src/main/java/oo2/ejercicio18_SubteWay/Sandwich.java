package oo2.ejercicio18_SubteWay;

public class Sandwich {

	Ingrediente bread, main, sauce, additional;

	
	public Sandwich(Ingrediente bread, Ingrediente main, Ingrediente sauce, Ingrediente additional) {
		this.bread = bread;
		this.main = main;
		this.sauce = sauce;
		this.additional = additional;
	}

	public Ingrediente getBread() {
		return bread;
	}

	public Ingrediente getMain() {
		return main;
	}

	public Ingrediente getSauce() {
		return sauce;
	}

	public Ingrediente getAdditional() {
		return additional;
	}
	
	public double getPrice() {
		return this.bread.getPrice() + this.main.getPrice() + this.sauce.getPrice() + this.additional.getPrice();
	}
}
