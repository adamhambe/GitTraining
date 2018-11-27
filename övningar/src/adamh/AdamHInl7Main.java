package adamh;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class AdamHInl7Main {
	
	public static void main(String[] args) {
		
//		I use Locale to set the locale to swedish default
		Locale locale = new Locale("sv", "SE");
		Locale.setDefault(locale);
		
//		I declare and instantiate objects belonging to the Artikel class. In the contructor I set each respective value.
		Artikel apelsin1 = new Artikel(100, "Apelsiner", 12.5);
		Artikel apelsin2 = new Artikel(100, "Apelsiner", 10);
		Artikel banan1 = new Artikel(50, "Bananer", 17.5);
		Artikel banan2 = new Artikel(100, "Bananer", 17.5);

//		I format using printf and use the instantiated objects to get each initiated value
		System.out.printf("| %04d | %-10s | %.2f | %10.2f | %n", apelsin1.getAntal(), apelsin1.getVara(), apelsin1.getPris(), apelsin1.getTotalPris());
		System.out.printf("| %04d | %-10s | %.2f | %10.2f | %n", banan1.getAntal(), banan1.getVara(), banan1.getPris(), banan1.getTotalPris());
		System.out.printf("| %04d | %-10s | %.2f | %10.2f | %n", apelsin2.getAntal(), apelsin2.getVara(), apelsin2.getPris(), apelsin2.getTotalPris());
		System.out.printf("| %04d | %-10s | %.2f | %10.2f | %n", banan2.getAntal(), banan2.getVara(), banan2.getPris(), banan2.getTotalPris());
		
		System.out.println();
		
//		Formatter is used for numeric output and local date/time specific format.
		Formatter f1 = new Formatter();
		f1.format(Locale.ENGLISH, "%1$ta %1$tb %1$te %1$tT %1$tZ %1$tY %nSpråkkod: en", Calendar.getInstance());
		System.out.println(f1);
		
		Formatter f2 = new Formatter();
		f2.format(Locale.FRENCH, "%1$ta %1$tb %1$te %1$tT %1$tZ %1$tY %nSpråkkod: fr", Calendar.getInstance());
		System.out.println(f2);
		
		Formatter f3 = new Formatter();
		f3.format(Locale.GERMAN, "%1$ta %1$tb %1$te %1$tT %1$tZ %1$tY %nSpråkkod: de", Calendar.getInstance());
		System.out.println(f3);
		
	}

}
