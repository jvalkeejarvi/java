import java.util.*;

public class LampotilaMuunnoksia {
	public static final Scanner lukija = new Scanner(System.in);
	public static void main(String[] args) {
		Locale suomilocale = new Locale("fi","Fi");
		lukija.useLocale(suomilocale);

		double fahrenheit;
		double celsius;

		System.out.print("Anna Fahrenheit-asteet: ");

		fahrenheit = lukija.nextDouble();
		celsius = (5.0/9) * (fahrenheit - 32);

		System.out.printf(suomilocale, "%.2f Fahrenheit-astetta on %.2f Celcius astetta.", fahrenheit, celsius);

	}

}
