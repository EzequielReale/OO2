package oo2.ejercicio18_SubteWay;

public class Sandwich {

	private Ingredient bread, main, sauce, additional;

	protected void setBread(Ingredient bread) {
		this.bread = bread;
	}

	protected void setMain(Ingredient main) {
		this.main = main;
	}

	protected void setSauce(Ingredient sauce) {
		this.sauce = sauce;
	}

	protected void setAdditional(Ingredient additional) {
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
