package adamh;

import java.util.Scanner;

public class AdamHInl8Main {

	public static void main(String[] args) {
		
//		I present each result and scan the choice
		System.out.println("----------\n1. Cirkel:\n2. Rektangel:\n3. Kvadrat:\n----------\n\nVälj figur");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		
//		I use switch cases for each choice
		switch(val) {
		case 1:
//			I ask for and scan the radius
			System.out.println("Ange radie: ");
			double radie = sc.nextDouble();
//			I call the class AdamInl6_Cirkel and use this to calculate the result of area, diameter and circumference
			AdamHInl6_Cirkel cir = new AdamHInl6_Cirkel(radie);
			String circelArea = String.format("%.2f" , cir.avläsArea());
			String circelDiameter = String.format("%.2f" , cir.avläsDiameter());
			String circelOmkrets = String.format("%.2f", cir.avläsOmkrets());
//			I present the results
			System.out.println("Circelns area är " + circelArea + " ae\nCircelns omkrets är " 
			+ circelOmkrets + " le\nCircelns diameter är " + circelDiameter + " le");
			break;
			
//		I repeat the same process as above
		case 2:
			System.out.println("Ange höjd: ");
			double höjd = sc.nextDouble();
			System.out.println("Ange bredd: ");
			double bredd = sc.nextDouble();
			AdamHInl6_Rektangel rek = new AdamHInl6_Rektangel(höjd, bredd);
			String rektangelArea = String.format("%.2f", rek.avläsArea());
			String rektangelOmkrets = String.format("%.2f", rek.avläsOmkrets());
			String rektangelDiagonal = String.format("%.2f", rek.avläsDiagonal());
			System.out.println("Rektangelns area är " + rektangelArea + " ae\nRektangelns omkrets är " + 
			rektangelOmkrets + " le\nRektangelns diagonal är " + rektangelDiagonal + " le");
			break;
		case 3:
			System.out.println("Ange sida: ");
			double sida = sc.nextDouble();
			AdamHInl6_Kvadrat kva = new AdamHInl6_Kvadrat(sida);
			String kvadratArea = String.format("%.2f", kva.avläsArea());
			String kvadratOmkrets = String.format("%.2f", kva.avläsOmkrets());
			String kvadratDiagonal = String.format("%.2f", kva.avläsDiagonal());
			System.out.println("Kvadratens area är " + kvadratArea + " ae\nKvadratens omkrets är " + 
			kvadratOmkrets + " le\nKvadratens diagonal är " + kvadratDiagonal + " le");
			break;
		default:
			System.out.println("Val existerar inte");
		}
		sc.close();

	}

}
