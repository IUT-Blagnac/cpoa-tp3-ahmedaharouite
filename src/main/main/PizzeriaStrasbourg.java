package main;

public class PizzeriaStrasbourg extends Pizzeria {
	FabriquePizzaStrasbourg fabrique;
	
	public PizzeriaStrasbourg() {
		fabrique = FabriquePizzaStrasbourg.getInstance();
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
