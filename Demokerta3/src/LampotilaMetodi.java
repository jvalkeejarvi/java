import java.util.Locale;
import java.util.Scanner;

public class LampotilaMetodi {
	public static final Scanner lukija = new Scanner(System.in);

	public static double annaFahrenheit(double fahrenheit) {

		double celcius = (5.0 / 9) * (fahrenheit - 32);

		return celcius;
	}

	public static void main(String[] args) {
		Locale suomilocale = new Locale("fi", "Fi");
		lukija.useLocale(suomilocale);

		double fahrenheit;
		double celsius;

		System.out.print("Anna Fahrenheit-asteet: ");

		fahrenheit = lukija.nextDouble();

		celsius = annaFahrenheit(fahrenheit);

		System.out.printf(suomilocale,
				"%.2f Fahrenheit-astetta on %.2f Celsius astetta.", fahrenheit,
				celsius);

	}

}
