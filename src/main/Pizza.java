import java.util.ArrayList;

abstract public class Pizza {
	 String nom;
	 String pate;
	 String sauce;
	 ArrayList<String> garnitures = new ArrayList<String>();
	 
	 public String getNom() {
		 return nom;
	 }

	 public void preparer() {
		System.out.println("Preparation de Pizza\nEtalage de la pate... \nAjout de la sauce... \nAjout des garnitures: ");
		
		for (int i=0; i<garnitures.size(); i++) {
			System.out.println("  " + garnitures.get(i));
		}
	 }

	 public void cuire() {
		 System.out.println("Cuisson 25 minutes a 180°");
	 }

	 public void couper() {
		 System.out.println("Decoupage par default");
	 }

	 public void emballer() {
		 System.out.println("Emballage dans une boite officielle");
	 }
}
