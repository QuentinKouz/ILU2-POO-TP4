package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Produit.Unite;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier("sanglier1",Unite.KILOGRAMME,2000, obelix);
		Sanglier sanglier2 = new Sanglier("sanglier2",Unite.KILOGRAMME,1500, obelix);
		Sanglier sanglier3 = new Sanglier("sanglier3",Unite.KILOGRAMME,1000, asterix);
		Sanglier sanglier4 = new Sanglier("sanglier4",Unite.KILOGRAMME,500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		System.out.println("ETAT MARCHE");
		
		
		// Création et initialisation des étals
        Etal<Sanglier> etalObelix = new Etal<>();
        etalObelix.installerVendeur(obelix, sangliersObelix, 8);
        System.out.println(etalObelix.etatEtal());
        
        Etal<Sanglier> etalAsterix = new Etal<>();
        etalAsterix.installerVendeur(asterix, sangliersAsterix, 10);
        System.out.println(etalAsterix.etatEtal());
        
        Etal<Poisson> etalPoisson = new Etal<>();
        etalPoisson.installerVendeur(ordralfabetix, poissons, 7);
        System.out.println(etalPoisson.etatEtal());
        
        System.out.println("A l'étal 0 je paye " + etalObelix.acheterProduit(1) + " sous");
        System.out.println("A l'étal 1 je paye " + etalAsterix.acheterProduit(2) + " sous");
        System.out.println("Je voulais 3 sangliers, j'en ai acheté 3.");
        System.out.println("ETAT MARCHE");
        System.out.println(etalAsterix.etatEtal());
        System.out.println(etalObelix.etatEtal());
        System.out.println(etalPoisson.etatEtal());

		

	}
	
}
