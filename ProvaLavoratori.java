package lezione10;

public class ProvaLavoratori {
	public static void main(String[] args) {
		Lavoratore[] lavoratori = new Lavoratore[5];
		
		lavoratori[0] = new Capo("Mario", "Rossi");
		lavoratori[1] = new Impiegato("Roberto", "Sada");
		lavoratori[2] = new Impiegato("Carla", "Sada");
		lavoratori[3] = new Impiegato("Francesca", "Sada");
		lavoratori[4] = new Impiegato("Luigi", "Sada");
		
		for(int i=0; i<lavoratori.length; i++) {
			System.out.println(lavoratori[i].stipendio(22));
		}
	}
}
