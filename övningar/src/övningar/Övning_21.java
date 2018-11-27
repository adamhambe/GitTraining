package övningar;

import java.util.Scanner;

public class Övning_21 {

	public static void main(String[] args) {
		
		double res = 0;
		double count = 0;
		
		System.out.println("Ange de tal + Enter som du vill ange medelvärden för\nAvsluta inmatningen med en bokstav: ");
				
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()) {
			res += sc.nextDouble();
			count++;
		}
		
		res = res/count;
		System.out.println(res);
		
		System.out.println("Medelvärdet av de inmatade talen = " + res);
		
	}

}