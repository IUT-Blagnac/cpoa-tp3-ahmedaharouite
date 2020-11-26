package main;

public class Fabrique {
	public static Pizza creerPrizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("fromage")) {
			pizza = new PizzaFromage();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecque();
		} else {
			pizza = new PizzaPoivrons();
		}
		
		return pizza;
	}
}
