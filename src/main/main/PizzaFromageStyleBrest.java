package main;

public class PizzaFromageStyleBrest extends Pizza{
	
	@Override
	public String getNom() {
		return "Pizza sauce style brest et fromage";
	}

	@Override
	public void preparer() {
		this.garnitures.add("Parmigiano reggiano rape");
		super.preparer();
	}

	@Override
	public void cuire() {
		super.cuire();
	}

	@Override
	public void couper() {
		System.out.println("Decoupage en parts triangulaires");
	}

	@Override
	public void emballer() {
		super.emballer();
	}

}
