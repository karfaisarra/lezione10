package lezione10.pavimento;

public class Pavimento {

	private Piastrella p;
	private int numeroPiastrelle;
	
	public Pavimento(Piastrella p, int numeroPiastrelle) {
		this.p=p;
		this.numeroPiastrelle=numeroPiastrelle;
	}
	
	public Piastrella getP() {
		return p;
	}
	public void setP(Piastrella p) {
		this.p = p;
	}
	public int getNumeroPiastrelle() {
		return numeroPiastrelle;
	}
	public void setNumeroPiastrelle(int numeroPiastrelle) {
		this.numeroPiastrelle = numeroPiastrelle;
	}
	
	public double getSuperficie() {
		return p.getArea()*numeroPiastrelle;
	}
}