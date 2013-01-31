import java.util.Locale;
import java.util.Scanner;

public class Korko {

	private static final Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) {

		Locale suomilocale = new Locale("fi", "Fi");
		lukija.useLocale(suomilocale);

		double paaoma;
		double korko1;
		double vuodet;
		double korko2;
		double loppusumma;

		System.out.print("Anna alkup‰‰oma: ");
		paaoma = lukija.nextDouble();

		System.out.print("Anna vuosikorko: ");
		korko1 = lukija.nextDouble();

		System.out.print("Anna kuluneet vuodet: ");
		vuodet = lukija.nextDouble();

		korko2 = Math.pow((korko1 + 100) / 100, vuodet);

		loppusumma = korko2 * paaoma;

		System.out.printf(suomilocale, "Loppusumma on %.2f", loppusumma);

		lukija.close();

	}

}
