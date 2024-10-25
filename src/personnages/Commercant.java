package personnages;

public class Commercant extends Humain {

	// Dans la classe Humain protected l'att porteFeuille de private à protected
	// (héritage)

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent); // Utilise super pour appeler le constructeur de Humain
	}

	public double seFaireExtorquer(double montant) {
		double argentExtorque = getArgent(); // Utilise super pour accéder à la méthode getArgent()
		super.parler("Le monde est vraiment trop injuste !");
		return perdreArgent(montant);
	}

	public void recevoir(int argent) {
		super.gagnerArgent(super.getArgent() + argent); // Utilise super pour accéder à getArgent et setArgent
	}

	double seFairEextroquer(double montant) {
		perdreArgent(montant);
		return montant;
	}

	double recevoirArgent(double montant) {
		gagnerArgent(montant);
		return montant;
	}

}
