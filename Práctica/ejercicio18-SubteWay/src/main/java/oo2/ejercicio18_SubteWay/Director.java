package oo2.ejercicio18_SubteWay;

public class Director {

	public void buildClassicSandwich(Builder builder) {
		builder.setBread(new Ingredient("Brioche", 100));
		builder.setMain(new Ingredient("Ternera", 300));
		builder.setSauce(new Ingredient("Mayonesa", 20));
		builder.setAdditional(new Ingredient("Tomate", 80));
	}
	
	public void buildVegetarianSandwich(Builder builder) {
		builder.setBread(new Ingredient("Semillas", 120));
		builder.setMain(new Ingredient("Provoleta grillada", 200));
		builder.setSauce(new Ingredient("", 0));
		builder.setAdditional(new Ingredient("Berenjenas al escabeche", 100));
	}
	
	public void buildVeganSandwich(Builder builder) {
		builder.setBread(new Ingredient("Integral", 100));
		builder.setMain(new Ingredient("Milanesa de girgolas", 500));
		builder.setSauce(new Ingredient("Salsa criolla", 20));
		builder.setAdditional(new Ingredient("", 0));
	}
	
	public void buildTaccFreeSandwich(Builder builder) {
		builder.setBread(new Ingredient("Chipá", 150));
		builder.setMain(new Ingredient("Pollo", 250));
		builder.setSauce(new Ingredient("Salsa tártara", 18));
		builder.setAdditional(new Ingredient("Verduras grilladas", 200));
	}
}
