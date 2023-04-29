package oo2.ejercicio18_SubteWay;

public class Director {

	public void buildClassicSandwich(Builder builder) {
		builder.setBread(new Ingrediente("Brioche", 100));
		builder.setMain(new Ingrediente("Ternera", 300));
		builder.setSauce(new Ingrediente("Mayonesa", 20));
		builder.setAdditional(new Ingrediente("Tomate", 80));
	}
	
	public void buildVegetarianSandwich(Builder builder) {
		builder.setBread(new Ingrediente("Semillas", 120));
		builder.setMain(new Ingrediente("Provoleta grillada", 200));
		builder.setSauce(new Ingrediente("", 0));
		builder.setAdditional(new Ingrediente("Berenjenas al escabeche", 100));
	}
	
	public void buildVeganSandwich(Builder builder) {
		builder.setBread(new Ingrediente("Integral", 100));
		builder.setMain(new Ingrediente("Milanesa de girgolas", 500));
		builder.setSauce(new Ingrediente("Salsa criolla", 20));
		builder.setAdditional(new Ingrediente("", 0));
	}
	
	public void buildTaccFreeSandwich(Builder builder) {
		builder.setBread(new Ingrediente("Chipá", 150));
		builder.setMain(new Ingrediente("Pollo", 250));
		builder.setSauce(new Ingrediente("Salsa tártara", 18));
		builder.setAdditional(new Ingrediente("Verduras grilladas", 200));
	}
}
