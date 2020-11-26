package main;

public class FabriquePizzaBrest extends FabriquePizza{
	static FabriquePizzaBrest instance = new FabriquePizzaBrest();
	
	public static FabriquePizzaBrest getInstance() {
		return instance;
	}
	
	public static Pizza creerPrizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("fromage")) {
			pizza = new PizzaFromageStyleBrest();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecqueStyleBrest();
		} else {
			pizza = new PizzaPoivronsStyleBrest();
		}
		
		return pizza;
	}
}
