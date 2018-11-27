package adamh;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class AdamHInl13_Program_ArrayList {
	
//	I declare the values that I will need (I return here and write them down as I need them)
	private int maxpoäng;
	private int antalVärden;
	private int betygsgränsG;
	private int betygsgränsVG;
	private String filnamn;
	private String konkatFilnamn;
	private String konkatFilnamnTxt;
	private String namn;
	private int poäng;
	private double genomsnitt;
	private double res = 0;
	private int count = 0;
	
	
//	This is the constructor that I call in the main method
	public AdamHInl13_Program_ArrayList() {
		
//		I use declare a Scanner object and use System.in as I initialize variables through the console 
		Scanner sc = new Scanner(System.in);
		System.out.println("Ange skrivningens maxpoäng: ");
		maxpoäng = sc.nextInt();
		System.out.println("Hur många värden vill du mata in?");
		antalVärden = sc.nextInt();
		System.out.println("Ange betygsgräns för G: ");
		betygsgränsG = sc.nextInt();
		System.out.println("Ange betygsgräns för VG: ");
		betygsgränsVG = sc.nextInt();
		
//		I name the text file
		System.out.println("Ange skrivningens namn (namnet måste vara unikt): ");
		filnamn = sc.next();
		Formatter f1 = new Formatter();
		f1.format(Locale.getDefault(), "%1$tm%1$td%1$ty", Calendar.getInstance());
		konkatFilnamn = filnamn + f1;
		konkatFilnamnTxt = konkatFilnamn + ".txt";
		
//		I declare the three ArrayLists that I need
		ArrayList<String> arrNamn = new ArrayList<String>();
		ArrayList<Integer> arrPoäng = new ArrayList<Integer>();
		ArrayList<String> arrBetyg = new ArrayList<String>();
		
//		I add as many participants as I enter that took the test. I also declare their respective points and grades and store these in each loop.
		for (int i = 0; i < antalVärden; i++) {
			System.out.println("Ange namn: ");
			namn = sc.next();
			arrNamn.add(namn);
			System.out.println("Ange poäng: ");
			poäng = sc.nextInt();
			while (poäng > maxpoäng) {
				System.out.println("Du får inte ange ett värde över " + maxpoäng);
				System.out.println("Ange poäng: ");
				poäng = sc.nextInt();
			}
			if (poäng >= betygsgränsVG) {
				arrBetyg.add("VG");
				arrPoäng.add(poäng);

			}
			else if (poäng >= betygsgränsG) {
				arrBetyg.add("G");
				arrPoäng.add(poäng);
			}
			else {
				arrBetyg.add("IG");
				arrPoäng.add(poäng);
				}
		}
		
//		Iterate through the arrPoäng array and calculate the average result of the tests taken
		for (Integer nextInteger: arrPoäng) {	
			count++;
			res += nextInteger;
		}
		genomsnitt = res / count;
		
//		I use PrintWriter as a means to create and write to the text file.
		try {
			PrintWriter output = new PrintWriter(konkatFilnamnTxt);
			output.println("Resultat " + konkatFilnamn 
					+ "\nMaxpoäng " + maxpoäng 
					+ "\nG gräns " + betygsgränsG
					+ "\nVG gräns " + betygsgränsVG);
			output.println("Namn                 Poäng      Betyg"
					+ "\n============================================"
					);
			for (int i = 0; i < antalVärden; i++){
				output.printf("%-20s %-10d %s %n",arrNamn.get(i), arrPoäng.get(i), arrBetyg.get(i));
			}
			output.println();
			output.println("Genomsnitt: " + genomsnitt);
			output.close();
	
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
