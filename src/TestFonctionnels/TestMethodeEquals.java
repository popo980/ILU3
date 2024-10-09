package TestFonctionnels;

import cartes.Attaque;
import cartes.Borne;
import cartes.Carte;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.Parade;
import cartes.Type;

public class TestMethodeEquals {

	public static void main(String[] args) {
		Carte testAttaque1 = new Attaque(Type.CREVAISON);
		Carte testParade1 = new Parade(Type.CREVAISON);
		
		Carte testAttaque2 = new Attaque(Type.FEU);
		Carte testParade2 = new Parade(Type.FEU);
		
		Carte dbtLmt = new DebutLimite();
		Carte dbtLmt2 = new DebutLimite();
		Carte finLmt = new FinLimite();
		
		Carte brn1 = new Borne(25);
		Carte brn2 = new Borne(50);
		
		System.out.println("test 2 attaques diff (false): "+ testAttaque1.equals(testAttaque2));
		System.out.println("test 2 attaques egales (true): "+ testAttaque1.equals(testAttaque1));
		System.out.println("test 1 attaque et 1 parade diff (false): "+ testAttaque1.equals(testParade2));
		System.out.println("test 1 attaque et 1 parade egales (false): "+ testAttaque1.equals(testParade1));
		System.out.println("test 2 dbtLim diff (true): "+ dbtLmt.equals(dbtLmt2));
		System.out.println("test 2 dbtLim egaux  (true): "+ dbtLmt.equals(dbtLmt));
		System.out.println("test 1fin et 1dbt egaux (false): "+ dbtLmt.equals(finLmt));
		System.out.println("test 2 brn egales (true): "+ brn1.equals(brn1));
		System.out.println("test 2 brn diff (false): "+ brn1.equals(brn2));
	}


}
