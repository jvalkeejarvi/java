import java.util.Locale;
import java.util.Scanner;

public class SuorakulmainenSarmio {

	private static final Scanner lukija = new Scanner(System.in);

	public static double laskeSarmionAla(double pituus, double leveys, double korkeus) {
		
		double ala;
		
		ala = 2 * pituus * leveys + 2 * leveys * korkeus + 2 * korkeus * pituus;
		
		return ala;

	}
	
	public static double laskeSarmionTilavuus(double pituus, double leveys, double korkeus) {
		
		double tilavuus=pituus*leveys*korkeus;
		return tilavuus;
	}

	public static void main(String[] args) {

		Locale suomilocale = new Locale("fi", "Fi");
		lukija.useLocale(suomilocale);

		double a, b, c;
		double ala;
		double tilavuus;

		System.out.print("Anna suorakulmaisen särmiön korkeus: ");
		a = lukija.nextDouble();

		System.out.print("Anna suorakulmaisen särmiön leveys: ");
		b = lukija.nextDouble();

		System.out.print("Anna suorakulmaisen särmiön pituus: ");
		c = lukija.nextDouble();
		
		ala = laskeSarmionAla(a, b, c);
		tilavuus = laskeSarmionTilavuus(a,b,c);


		System.out.printf(suomilocale,
				"Särmiön pinta-ala on %.5f ja tilavuus %.5f", ala, tilavuus);

		lukija.close();

	}

}
