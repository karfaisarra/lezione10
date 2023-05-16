package lezione10.libri;

public class Prova {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("storia", 35);
		Libro l2 = new Libro("letteratura", 13);
		Libro l3 = new Libro("storia", 10);
		
		System.out.println(l1.uguale(l2));
		System.out.println(l1.uguale(l3));
	}

}