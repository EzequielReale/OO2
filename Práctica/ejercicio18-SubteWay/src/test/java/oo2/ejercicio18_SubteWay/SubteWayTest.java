package oo2.ejercicio18_SubteWay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubteWayTest {
	private Director subteway;
	private Builder sandwichBuilder;
	private Sandwich sandwich;

	
	@BeforeEach
	void setUp() {
		this.subteway = new Director();
	}

	@Test
	void testBuildClassicSandwich() {
		this.sandwichBuilder = new ClassicSandwichBuilder();
		this.subteway.buildSandwich(sandwichBuilder);
		sandwich = this.sandwichBuilder.getResult();
		assertEquals(500,sandwich.getPrice());
	}
	
	@Test
	void testBuildVegetarianSandwich() {
		this.sandwichBuilder = new VegetarianSandwichBuilder();
		this.subteway.buildSandwich(sandwichBuilder);
		sandwich = this.sandwichBuilder.getResult();
		assertEquals(420,sandwich.getPrice());
	}
	
	@Test
	void testBuildVeganSandwich() {
		this.sandwichBuilder = new VeganSandwichBuilder();
		this.subteway.buildSandwich(sandwichBuilder);
		sandwich = this.sandwichBuilder.getResult();
		assertEquals(620,sandwich.getPrice());
	}
	
	@Test
	void testBuildTaccFreeSandwich() {
		this.sandwichBuilder = new TaccFreeSandwichBuilder();
		this.subteway.buildSandwich(sandwichBuilder);
		sandwich = this.sandwichBuilder.getResult();
		assertEquals(618,sandwich.getPrice());
	}
}