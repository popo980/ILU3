package TestFonctionnels;

import cartes.Carte;
import cartes.JeuDeCartes;
import jeu.Sabot;
import jeu.Sabot.Iterateur;

public class TestSabot {

	public TestSabot() {
	}
	
	public static void main(String[] args) {
		Sabot pioche1 = new Sabot(new JeuDeCartes().donnerCartes());
		Sabot pioche2 = new Sabot(new JeuDeCartes().donnerCartes());
		System.out.println("--- boucle a ---\n");
		for (int i=0; i<106; i++) {
			pioche1.piocher();
		}
		System.out.println("\n--- boucle b ---\n");
		for (int i=0; i<106; i++) {
			Iterateur ite2 = pioche2.getIte();
			if(ite2.hasNext()) {
				System.out.println(ite2.next().toString());
				ite2.remove();
				
			}
		}
	}

}
