package lezione10.libri;

public class Libro implements Documenti {
	
	private String soggetto;
	private int costo;
	
	public Libro(String soggetto, int costo) {
		this.soggetto=soggetto;
		this.costo=costo;
	}
	
	public String getSoggetto() {
		return soggetto;
	}

	public int getCosto() {
		return costo;
	}
	
	@Override
	public boolean uguale(Documenti d) {
		if(d instanceof Libro && d!=null) {
			//Libro p = (Libro)d;
			if(((Libro)d).getSoggetto().equalsIgnoreCase(soggetto)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
