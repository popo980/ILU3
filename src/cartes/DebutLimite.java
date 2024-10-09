package cartes;

public class DebutLimite extends Limite {

	public DebutLimite() {
	}
	@Override
	public String toString() {
		return "debut limite a 50";
	}
	public boolean equals(Object obj) {
		if(obj instanceof DebutLimite lim) {
			return true;
		}
		return false;
	}
}
