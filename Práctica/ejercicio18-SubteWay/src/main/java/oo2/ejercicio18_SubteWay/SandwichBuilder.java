package oo2.ejercicio18_SubteWay;

public class SandwichBuilder implements Builder {

	Ingredient bread, main, sauce, additional;

	@Override
	public void setBread(Ingredient bread) {
		this.bread = bread;
	}

	@Override
	public void setMain(Ingredient main) {
		this.main = main;
	}

	@Override
	public void setSauce(Ingredient sauce) {
		this.sauce = sauce;
	}

	@Override
	public void setAdditional(Ingredient additional) {
		this.additional = additional;
	}
	
	public Sandwich getResult() {
		return new Sandwich(this.bread, this.main, this.sauce, this.additional);
	}
}
