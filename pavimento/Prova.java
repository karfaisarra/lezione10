package lezione10.pavimento;

public class Prova {

	public static void main(String[] args) {
		
		PiastrellaQuadrata p1=new PiastrellaQuadrata(5);
		System.out.println("Area piastrella quadrata: " + p1.getArea());
		
		PiastrellaTriangolare p2=new PiastrellaTriangolare(4, 6);
		System.out.println("Area piastrella triangolare: " + p2.getArea());
		
		Pavimento pa1 =new Pavimento(p1, 100);
		System.out.println("Superficie pavimento: " + pa1.getSuperficie());
		
		Pavimento pa2 =new Pavimento(p2, 100);
		System.out.println("Superficie pavimento: " + pa2.getSuperficie());
	}
}