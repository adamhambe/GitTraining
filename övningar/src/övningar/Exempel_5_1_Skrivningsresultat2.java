package övningar;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exempel_5_1_Skrivningsresultat2 {
	
	public Exempel_5_1_Skrivningsresultat2() {
		
	}
	
	public static void main(String[] args) throws IOException {
		int i = 0;
		Scanner inmat = new Scanner(System.in);
		System.out.print("Ange filens namn: ");	System.out.flush();
		String filnamn = inmat.next();
		Scanner filSc = new Scanner(new File(filnamn));
		System.out.println("\nGodkända elever:\n");
		while (filSc.hasNext()) {
			String namn = filSc.next();
			while(!filSc.hasNextInt())
				namn += " " + filSc.next();
			int poäng = filSc.nextInt();
			if (poäng >= 45) {
				i++; //Räkna antalet godkända
				System.out.println(namn + " hade " + poäng);
			}	
		}
		int j = 0; //Räknare för antalet rader
		String harNästa = "";
		//Kör om scanner objektet och räkna antalet rader
		filSc = new Scanner(new File(filnamn));
		while (filSc.hasNext()) {
			harNästa = filSc.nextLine(); // Läser in hela raden?
			j++;
		}
		int ig = j - i; //Antalet ig
		System.out.println("\nAv totalt " + j + " elver. \nskall " + ig 
				+ " göra omskrivningen.");
		
	}

}
