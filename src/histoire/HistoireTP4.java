package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {

		Humain alex = new Humain("Alex", "café", 50);
		Humain prof = new Humain("Prof", "kombucha", 42);

		alex.direBonjour();
		alex.boire();
		alex.acheter("livre", 15);
		System.out.println("Argent restant : " + alex.getArgent() + " euros");

		alex.acheter("ordinateur", 100);

		System.out.println("Argent restant : " + alex.getArgent() + " euros");
		alex.gagnerArgent(3500.0);
		System.out.println("Argent restant après salaire : " + alex.getArgent() + " euros");
		alex.perdreArgent(50.0);
		System.out.println("Argent restant après soirée : " + alex.getArgent() + " euros");

		prof.direBonjour();

		System.out
				.println("J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");

		prof.boire();

	}
}