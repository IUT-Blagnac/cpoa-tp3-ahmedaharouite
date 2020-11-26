package main;

public class PizzeriaBrest extends Pizzeria {

	FabriquePizzaBrest fabrique;
	
	public PizzeriaBrest() {
		fabrique = FabriquePizzaBrest.getInstance();
	}
	
	
	
	@Override
	public Pizza commanderPizza(String type) {

		Pizza pizza = fabrique.creerPrizza(type);

		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
	}
}
