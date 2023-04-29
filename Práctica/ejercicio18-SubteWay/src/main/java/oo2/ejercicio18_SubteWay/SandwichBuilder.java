package oo2.ejercicio18_SubteWay;

public class SandwichBuilder implements Builder {

	Ingrediente bread, main, sauce, additional;

	@Override
	public void setBread(Ingrediente bread) {
		this.bread = bread;
	}

	@Override
	public void setMain(Ingrediente main) {
		this.main = main;
	}

	@Override
	public void setSauce(Ingrediente sauce) {
		this.sauce = sauce;
	}

	@Override
	public void setAdditional(Ingrediente additional) {
		this.additional = additional;
	}
	
	public Sandwich getResult() {
		return new Sandwich(this.bread, this.main, this.sauce, this.additional);
	}
}
