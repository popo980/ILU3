package cartes;

public enum Type {
	FEU("vehicule prioritaire","feu rouge", "feu Vert"),
	ESSENCE("citerne d'essence","panne d'essence","essence"),
	CREVAISON("increvable","crevaison","roue de secours"),
	ACCIDENT("as du volant","accident","reparation");
	
	private String botte;
	private String attaque;
	private String parade;
	
	Type(String botte, String attaque, String parade) {
		this.botte = botte;
		this.attaque = attaque;
		this.parade = parade;
	}
	
	public String botte() {
		return botte;
	}
	public String parade() {
		return parade;
	}
	public String attaque() {
		return attaque;
	}
	
}
