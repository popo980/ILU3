package cartes;

public class Attaque extends Bataille {

	public Attaque(Type type) {
		super(type);
	}
	@Override
	public String toString() {
		return getType().attaque();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Attaque att) {
			return att.getType()==this.getType();
		}
		return false;
	}

}
