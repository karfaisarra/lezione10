package lezione10.interfacceClasseAstratte;

public class AL extends A {
	
	private int efficenza;
	
	public AL(String sigla, int efficenza) {
		super(sigla);
		this.efficenza=efficenza;
	}
	
	public int getEfficenza() {
		return efficenza;
	}

	@Override
	public boolean superiore(CMP x) {
		if(x==null || !(x instanceof AL)) {
			return false;
		}else {
			AL p = (AL)x;
			if(efficenza>p.getEfficenza()) {
				return true;
			}else {
				return false;
			}
		}
	}
}
