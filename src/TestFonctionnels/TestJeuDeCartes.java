package TestFonctionnels;

import cartes.JeuDeCartes;

public class TestJeuDeCartes {

	public TestJeuDeCartes() {
	}
	
	public static void main(String[] args) {
		JeuDeCartes test = new JeuDeCartes();
		System.out.println("JEU:\n");
		System.out.println(test.affichageJeuDeCartes());
	}
}
