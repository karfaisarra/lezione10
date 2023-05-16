package lezione10.interfacceClasseAstratte;

public class AM extends A {
	
	private double potenza;
	
	public AM(String sigla, double potenza) {
		super(sigla);
		this.potenza=potenza;
	}
	
	public double getPotenza() {
		return potenza;
	}
	
	@Override
	public boolean superiore(CMP x) {
		if(x==null || !(x instanceof AM)) {
			return false;
		}else {
			AM p = (AM)x;
			if(potenza>p.getPotenza()) {
				return true;
			}else {
				return false;
			}
		}
	}
}
