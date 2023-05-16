package lezione10.interfacceClasseAstratte;

public class Prova {

	public static void main(String[] args) {
		
		A aereo1 = new AL("101010", 90);
		
		A aereo2 = new AM("123456", 105);
		
		A aereo3 = new AL("175264", 808);
		
		A aereo4 = new AM("789456", 66.9);
		
		System.out.println(aereo1.superiore(aereo2));
		System.out.println(aereo2.superiore(aereo4));
		System.out.println(aereo3.superiore(aereo1));
		System.out.println(aereo4.superiore(null));
	}

}
