package main;

public class PizzaFromageStyleStrasbourg extends Pizza{
	
	@Override
	public String getNom() {
		return "Pizza pate style Strasbourg et fromage";
	}

	@Override
	public void preparer() {
		this.garnitures.add("Mozzarella en lamelles");
		super.preparer();
	}

	@Override
	public void cuire() {
		super.cuire();
	}

	@Override
	public void couper() {
		System.out.println("Decoupage en parts carrees");
	}

	@Override
	public void emballer() {
		super.emballer();
	}

}
