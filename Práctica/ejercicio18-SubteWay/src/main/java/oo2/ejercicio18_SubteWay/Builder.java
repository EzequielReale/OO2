package oo2.ejercicio18_SubteWay;

public abstract class Builder {

	protected Sandwich sandwich;
	

	public Builder () {
		this.sandwich = new Sandwich();
	}

	public abstract void setBread();
	
	public abstract void setMain();
	
	public abstract void setSauce();
	
	public abstract void setAdditional();
	
	public Sandwich getResult() {
		return this.sandwich;
	}
}
