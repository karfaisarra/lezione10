package lezione10.interfacceClasseAstratte;

public abstract class A implements CMP {
	
	private String sigla;
	
	public A(String sigla) {
		this.sigla=sigla;
	}
	
	public String getSigla() {
		return sigla;
	}
}
