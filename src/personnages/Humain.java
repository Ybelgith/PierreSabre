package personnages;

public class Humain {

	private String nom;
	private String boissonPreferee;
	protected double porteFeuille;

	public Humain(String nom, String boissonPreferee, int argent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.porteFeuille = porteFeuille;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonPreferee + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPreferee + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (porteFeuille >= prix) {
			perdreArgent(prix);
			parler("Je viens d’acheter " + bien + " pour " + prix + " euros.");
		} else {
			parler("Je n’ai pas assez d’argent pour acheter " + bien + "...");
		}
	}

	protected void parler(String texte) {
		System.out.println(texte);
	}

	protected void gagnerArgent(double gain) {
		porteFeuille += gain;
	}

	protected double perdreArgent(double perte) {
		if (porteFeuille >= perte) {
			porteFeuille -= perte;
		} else {
			porteFeuille = 0;
		}
		return perte;
	}

	public double getArgent() {
		return porteFeuille;
	}
}
