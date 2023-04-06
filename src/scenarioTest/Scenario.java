package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Produit.Unite;
import village.IVillage;
import produit.Sanglier;
import villagegauloisold.DepenseMarchand;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class Scenario {

	public static void main(String[] args) {

		// TODO Partie 4 : creer de la classe anonyme Village
		IVillage village = new IVillage() {
			
			public <P extends Produit> boolean installerVendeur(Etal<P> etal,Gaulois vendeur, P[] produit, int prix) {
				etal.installerVendeur(vendeur,produit,prix);
				return false;
			};
			
			public DepenseMarchand[] acheterProduit(String produit,int quantiteSouhaitee) {
				
			};

			
		};
		// fin

		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Astérix", 6);

		IEtal etalSanglierObelix = new Etal<>();
		IEtal etalSanglierAsterix = new Etal<>();
		IEtal etalPoisson = new Etal<>();

		Sanglier sanglier1 = new Sanglier("sanglier1", Unite.KILOGRAMME,2000, obelix);
		Sanglier sanglier2 = new Sanglier("sanglier2", Unite.KILOGRAMME,1500, obelix);
		Sanglier sanglier3 = new Sanglier("sanglier3", Unite.KILOGRAMME,1000, asterix);
		Sanglier sanglier4 = new Sanglier("sanglier4", Unite.KILOGRAMME,500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };

		village.installerVendeur(etalSanglierAsterix, asterix, sangliersAsterix, 10);
		village.installerVendeur(etalSanglierObelix, obelix, sangliersObelix, 8);
		village.installerVendeur(etalPoisson, ordralfabetix, poissons, 5);

		System.out.println(village);

		DepenseMarchand[] depense = village.acheterProduit("sanglier", 3);

		for (int i = 0; i < depense.length && depense[i] != null; i++) {
			System.out.println(depense[i]);
		}

		System.out.println(village);

	}

}
