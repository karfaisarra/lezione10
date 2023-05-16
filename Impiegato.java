package lezione10;

public class Impiegato extends Lavoratore {

	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
	}
	
	@Override
	public double stipendio(int giorni) {
		return super.stipendio(giorni) + 10*giorni;
	}
}
