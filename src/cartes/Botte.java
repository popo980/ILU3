package cartes;

public class Botte extends Probleme {

	public Botte(Type type) {
		super(type);
	}
	
	@Override
	public String toString() {
		return getType().botte();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Botte btt) {
			return btt.getType()==this.getType();
		}
		return false;
	}
}
