
public class PizzeriaBrest extends Pizzeria {

	@Override
	public Pizza commanderPizza(String type) {

		Pizza pizza;

		if (type.equals("fromage")) {
			pizza = new PizzaFromageStyleBrest();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecque();
		} else {
			pizza = new PizzaPoivrons();
		}

		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
	}
}
