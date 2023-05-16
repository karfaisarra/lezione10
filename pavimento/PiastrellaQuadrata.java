package lezione10.pavimento;

public class PiastrellaQuadrata extends Piastrella {

	private double lato;
	
	public PiastrellaQuadrata(double lato) {
		this.lato=lato;
	}
	
	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

	@Override
	public double getArea() {
		return lato*lato;
	}

}
