import java.util.Locale;
import java.util.Scanner;

public class PaaOma {

	private static final Scanner lukija = new Scanner(System.in);
	
	public static double laskePaaOma(double paaoma, double korko, double vuodet){
		
		double korko2 = Math.pow((korko + 100) / 100, vuodet);
		double loppusumma = korko2 * paaoma;
		return loppusumma;
		
	}

	public static void main(String[] args) {

		Locale suomilocale = new Locale("fi", "Fi");
		lukija.useLocale(suomilocale);

		double paaoma;
		double korko;
		double vuodet;
		double loppusumma;

		System.out.print("Anna alkup‰‰oma: ");
		paaoma = lukija.nextDouble();

		System.out.print("Anna vuosikorko: ");
		korko = lukija.nextDouble();

		System.out.print("Anna kuluneet vuodet: ");
		vuodet = lukija.nextDouble();
		
		loppusumma=laskePaaOma(paaoma, korko, vuodet);

		System.out.printf(suomilocale, "Loppusumma on %.2f", loppusumma);

		lukija.close();

	}

}
