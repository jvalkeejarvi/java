import java.util.Scanner;
public class PotenssiinNelj� {
	
	public static final Scanner lukija = new Scanner(System.in);
	
	public static double lasku(double luku1, double luku2){
		double arvo = Math.pow((luku1-luku2),4);
		return arvo;
	}
	

	public static void main(String[] args) {
		
		double luku1;
		double luku2;
		double tulos;
		
		System.out.println("Anna kaksi kokonaislukua. Ohjelma laskee niiden erotuksen nelj�nnen potenssin.");
		
		System.out.print("Anna ensimm�inen luku:");
		luku1 = lukija.nextDouble();
		
		System.out.print("Anna toinen luku:");
		luku2 = lukija.nextDouble();
		
		tulos=lasku(luku1, luku2);
		
		System.out.printf("Tulos on %.2f", tulos);

	}

}
