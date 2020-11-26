package main;

public class PizzaFromageStyleBrest extends Pizza{
	
	@Override
	public String getNom() {
		return "Pizza sauce style brest et fromage";
	}

	@Override
	public void preparer() {
		this.garnitures.add(" Parmigiano reggiano râpé");
		super.preparer();
	}

	@Override
	public void cuire() {
		super.cuire();
	}

	@Override
	public void couper() {
		System.out.println("Découpage en parts triangulaires");
	}

	@Override
	public void emballer() {
		super.emballer();
	}

}
