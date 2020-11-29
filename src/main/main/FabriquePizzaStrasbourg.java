package main;

public class FabriquePizzaStrasbourg extends FabriquePizza{
	static FabriquePizzaStrasbourg instance = new FabriquePizzaStrasbourg();
	
	public static FabriquePizzaStrasbourg getInstance() {
		return instance;
	}
	
	public static Pizza creerPrizza(String type) {
		Pizza pizza = null;

		if (type.equals("fromage")) {
			pizza = new PizzaFromageStyleStrasbourg();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecqueStyleStrasbourg();
		} else {
			pizza = new PizzaPoivronsStyleStrasbourg();
		}
		
		return pizza;
	}
}
