package produit;

public class Sanglier extends Produit{
	private int poids;
	private String chasseur;
	private String nom = "sanglier";
	
	public Sanglier(String nom,Unite unite, int poids, String chasseur){
		super(nom,unite);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public int getPoids() {
		return poids;
	}
	public String getChasseur() {
		return chasseur;
	}
	
	public void descriptionProduit() {
		System.out.println(nom + " de " + poids + unite + "chassé par " + chasseur);
	}
}
