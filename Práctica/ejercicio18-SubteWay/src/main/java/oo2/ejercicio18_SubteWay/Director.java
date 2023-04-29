package oo2.ejercicio18_SubteWay;

public class Director {

	public void buildClassicSandwich(Builder builder) {
		builder.setPan(new Ingrediente("Brioche", 100));
		builder.setPrincipal(new Ingrediente("Ternera", 300));
		builder.setAderezo(new Ingrediente("Mayonesa", 20));
		builder.setAdicional(new Ingrediente("Tomate", 80));
	}
	
	public void buildVegetarianSandwich(Builder builder) {
		builder.setPan(new Ingrediente("Semillas", 120));
		builder.setPrincipal(new Ingrediente("Provoleta grillada", 200));
		builder.setAderezo(new Ingrediente("", 0));
		builder.setAdicional(new Ingrediente("Berenjenas al escabeche", 100));
	}
	
	public void buildVeganSandwich(Builder builder) {
		builder.setPan(new Ingrediente("Integral", 100));
		builder.setPrincipal(new Ingrediente("Milanesa de girgolas", 500));
		builder.setAderezo(new Ingrediente("Salsa criolla", 20));
		builder.setAdicional(new Ingrediente("", 0));
	}
	
	public void buildTaccFreeSandwich(Builder builder) {
		builder.setPan(new Ingrediente("Chipá", 150));
		builder.setPrincipal(new Ingrediente("Pollo", 250));
		builder.setAderezo(new Ingrediente("Salsa tártara", 18));
		builder.setAdicional(new Ingrediente("Verduras grilladas", 200));
	}
}
