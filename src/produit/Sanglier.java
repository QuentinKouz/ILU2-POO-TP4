package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poids;
	private Gaulois chasseur;
	private String nom = "sanglier";
	
	public Sanglier(String nom,Unite unite, int poids, Gaulois chasseur){
		super(nom,unite);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public int getPoids() {
		return poids;
	}
	public String getChasseur() {
		return chasseur.getNom();
	}
	
	public String description() {
		return nom + " de " + poids + "kg chassé par " + chasseur.getNom();
	}
	
	@Override
	public int calculerPrix(int prix) {
		if (this.unite == Unite.KILOGRAMME) {
			return (prix * this.poids)/1000;
		} else {
			return prix * (this.poids / 1000);
		}
	}
}
