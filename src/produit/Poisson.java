package produit;

public class Poisson extends Produit{
	private String date;
	private static String nom = "Poisson";
	private static Unite unite;
	
	public Poisson(String date) {
		super(nom,unite);
		this.date = date;
	}

}
