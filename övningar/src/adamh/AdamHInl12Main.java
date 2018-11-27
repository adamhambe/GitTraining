package adamh;


public class AdamHInl12Main {

	public static void main(String[] args) {
		
//		I create an object flagga and use this to call the arrays that I created in the AdamHInl12_Flagga class
		AdamHInl12_Flagga flagga = new AdamHInl12_Flagga();
//		I iterate over the the one dimensional array land and print out each element
		for (int i = 0; i < flagga.land.length; i++) {
			System.out.printf("%-20s", flagga.land[i]);
//			In the second loop I iterate over the two dimensional array and print out each element
			for (int j = 0; j < flagga.färger[i].length; j++) {
				System.out.printf(flagga.färger[i][j] + " ");
			}
			System.out.println();
		}
	}
}