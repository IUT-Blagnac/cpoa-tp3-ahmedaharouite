package main;

 public abstract class FabriquePizza {
	static FabriquePizza instance;
	
	public static FabriquePizza getInstance() {
		return instance;
	}
	
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
