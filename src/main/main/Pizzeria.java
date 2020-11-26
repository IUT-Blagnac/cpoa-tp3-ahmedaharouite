package main;

abstract public class Pizzeria {

	FabriquePizza fabrique;
	
	public Pizzeria() {
		fabrique = FabriquePizza.getInstance();
	}
	
	/**
	 * @param type
	 * @return a Pizza object according to the type
	 */
	public Pizza commanderPizza(String type) {

		Pizza pizza = fabrique.creerPrizza(type);

		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
	}
}
