package produit;


public abstract class Produit implements IProduit {
	private String nom;
	public enum Unite{
		GRAMME, KILOGRAMME, LITRE, CENTILITRE, MILLILITRE,PIECE
	}
	protected Unite unite;
	public Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}

	@Override
	public String getNom() {
		return nom;
	};
	
	@Override
	public void descriptionProduit(IProduit produit) {
	}
	
}
