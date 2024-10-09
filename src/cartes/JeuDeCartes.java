package cartes;

public class JeuDeCartes {
	
	private Configuration[] jeu = new Configuration[19];
	private int nbCartes;

	public JeuDeCartes() {
		jeu[0] = new Configuration(new Borne(25),10);
		jeu[1] = new Configuration(new Borne(50),10);
		jeu[2] = new Configuration(new Borne(75),10);
		jeu[3] = new Configuration(new Borne(100),12);
		jeu[4] = new Configuration(new Borne(200),4);
		
		jeu[5] = new Configuration(new Parade(Type.FEU),14);
		jeu[6] = new Configuration(new Parade(Type.ACCIDENT),6);
		jeu[7] = new Configuration(new Parade(Type.CREVAISON),6);
		jeu[8] = new Configuration(new Parade(Type.ESSENCE),6);
		
		jeu[9] = new Configuration(new Attaque(Type.FEU),5);
		jeu[10] = new Configuration(new Attaque(Type.ACCIDENT),3);
		jeu[11] = new Configuration(new Attaque(Type.CREVAISON),3);
		jeu[12] = new Configuration(new Attaque(Type.ESSENCE),3);
		
		jeu[13] = new Configuration(new FinLimite(),6);
		jeu[14] = new Configuration(new DebutLimite(),4);
		
		jeu[15] = new Configuration(new Botte(Type.FEU),1);
		jeu[16] = new Configuration(new Botte(Type.ACCIDENT),1);
		jeu[17] = new Configuration(new Botte(Type.CREVAISON),1);
		jeu[18] = new Configuration(new Botte(Type.ESSENCE),1);
	}
	
	public String affichageJeuDeCartes() {
		StringBuilder rslt = new StringBuilder();
		for (int i = 0; i<=18; i++) {
			rslt.append("\n"+jeu[i].getNbExemplaires()+"  "+jeu[i].getCarte().toString());
		}
		return rslt.toString();
	}
	
	public Carte[] donnerCartes() {
		Carte[] packet = new Carte[106];
		nbCartes=0;
		
		for (int i=0; i<jeu.length;i++) {
			packet = jeu[i].ajoutCarte(packet);
		}
		
		return packet;
	}
	
	private class Configuration{
		private int nbExemplaires;
		private Carte carte;
		
		public Configuration(Carte carte, int nbExemplaire) {
			this.nbExemplaires = nbExemplaire;
			this.carte = carte;
		}
		
		public Carte getCarte() {
			return carte;
		}
		
		public int getNbExemplaires() {
			return nbExemplaires;
		}
		
		public Carte[] ajoutCarte(Carte[] cartes) {
			for (int i =0;i<nbExemplaires;i++) {
				cartes[nbCartes] = this.carte;
				nbCartes++;
			}
			return cartes;
		}
	}
}
