package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.Carte;


public class Sabot {
	public Carte[] cartes;
	public int nbCartes = 106;
	public int nbIter = 0;
	
	public Sabot(Carte[] cartes) {
		this.cartes = cartes;
	}
	
	public boolean estVide() {
		return nbCartes == 0;
	}
	
	public void ajouterCarte(Carte newCard) {
		try {
			cartes[nbCartes]=newCard;
			nbCartes++;
			nbIter++;
		}catch (Exception e) {
			System.out.println("Ajout impossible, packet déjà pleins");
		}
	}
	
	public Carte piocher() {
		Iterateur ite = new Iterateur();
		if(ite.hasNext()) {
			Carte carte = ite.next();
			System.out.println("je pioche "+carte.toString());
			ite.remove();
			return carte;
		}
		else {
			throw new NoSuchElementException();
		}
	}
	
	public Iterateur getIte() {
		return new Iterateur();
		
	}
	
	public class Iterateur implements Iterator<Carte>{
		private int indiceIterateur;
		private boolean nextEffectue;
		private int nbOperationRef;
		
		private Iterateur() {
			this.indiceIterateur = 0;
			this.nextEffectue = false;
			this.nbOperationRef = nbIter;
		}
		
		@Override
		public Carte next() {
			if (this.hasNext()) {
				Carte carte = cartes[this.indiceIterateur];
				indiceIterateur++;
				this.nextEffectue = true;
				return carte;
			}
			else {throw new NoSuchElementException();}
		}
		
		@Override
		public boolean hasNext() {
			return indiceIterateur<nbCartes;
		}
		
		@Override
		public void remove() {
			if (nbIter != nbOperationRef) {
				throw new ConcurrentModificationException();
			}
			if (nbCartes==0	|| indiceIterateur>nbCartes || !nextEffectue) {
				System.out.println(nbCartes == 0);
				System.out.println(indiceIterateur>nbCartes);
				System.out.println(!nextEffectue);
				
				throw new NoSuchElementException();
			}
			for (int i = indiceIterateur-1; i<nbCartes-1;i++) {
				cartes[i] = cartes[i+1];
				nbIter++;
			}
			nbOperationRef++;
			nbIter++;
			nextEffectue = false;
			indiceIterateur--;
			nbCartes--;
		}
	}
	
}