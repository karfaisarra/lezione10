package lezione10;

public class Lavoratore {
	
	private String nome;
	private String cognome;
	private final double stipendioGiornaliero = 25;
	
	public Lavoratore(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}
	
	public double stipendio(int giorni) {
		return stipendioGiornaliero*giorni;
	}
	
}
