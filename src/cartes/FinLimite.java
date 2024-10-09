package cartes;

public class FinLimite extends Limite {

	public FinLimite() {
	}
	@Override
	public String toString() {
		return "Fin limite a 50";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof FinLimite lim) {
			return true;
		}
		return false;
	}
}
