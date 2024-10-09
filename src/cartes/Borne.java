package cartes;

public class Borne extends Carte {
	private int km;
	
	public Borne(int km) {
		this.km = km;
	}
	
	public int getKm() {
		return km;
	}
	
	@Override
	public String toString() {
		return km+" Bornes";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Borne borne) {
			return borne.getKm()==this.km;
		}
		return false;
	}
}
