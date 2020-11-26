package main;

public class PizzaFromageStyleStrasbourg extends Pizza{
	
	@Override
	public String getNom() {
		return "Pizza pâte style Strasbourg et fromage";
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
		System.out.println("Découpage en parts carrées");
	}

	@Override
	public void emballer() {
		super.emballer();
	}

}
