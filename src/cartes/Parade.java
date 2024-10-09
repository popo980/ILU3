package cartes;

public class Parade extends Bataille {
	
	public Parade(Type type) {
		super(type);
	}
	
	@Override
	public String toString() {
		return getType().parade();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Parade par) {
			return par.getType()==this.getType();
		}
		return false;
	}
}
