package main;

import java.util.ArrayList;

abstract public class Pizza {
	protected String nom;
	protected String pate;
	protected String sauce;
	protected ArrayList<String> garnitures;

	protected Pizza() {
		this.nom = "";
		this.pate = "";
		this.sauce = "";
		this.garnitures = new ArrayList<String>();
	}
	
	public String getNom() {
		return nom;
	}

	public void preparer() {
		System.out.println("Préparation de Pizza\nÉtalage de la pâte...\nAjout de la sauce...\nAjout des garnitures:");

		for (int i=0; i<garnitures.size(); i++) {
			System.out.println(" " + garnitures.get(i));
		}
	}

	public void cuire() {
		System.out.println("Cuisson 25 minutes a 180°");
	}

	public void couper() {
		System.out.println("Découpage par défault");
	}

	public void emballer() {
		System.out.println("Emballage dans une boîte officielle");
	}
}
