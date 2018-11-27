package random;

public class KlassMain {

	public static void main(String[] args) {
		
		Bil[] billista = new Bil [5]; //Skapar en array med plats för fem bilar.
		
		billista[0] = new Bil("GHN248", "Volvo", "V70", 170, 5, 1750 );
		System.out.printf("Antalet instansierade bilar är nu %d\n\n", Bil.getBilinstanser());
		
		billista[1] = new Bil("ABC321", "Ford", "Mondeo", 195, 5, 1675);
		System.out.printf("Antalet instansierade bilar är nu %d\n\n", Bil.getBilinstanser());
		
		billista[2] = new Bil("IJL843", "Fiat", "500", 90, 4, 1100);
		billista[3] = new Bil("UL6677", "Volkswagen", "Golf", 110, 4, 1200); //Här matar jag in ett ogiltigt reg no
		billista[4] = new Bil("FUB532", "Renault", "Traffic", 110, 3, 3600); //Här matar jag in en för hög vikt. 
		
		System.out.printf("Antalet instansierade bilar är nu %d\n\n", Bil.getBilinstanser());
		
		
		//Iteration som skriver ut samtliga bilar
		for (int i = 0 ; i < billista.length ; i++) {
			System.out.println(billista[i]);
		}

		
		

 		
		

	}

}
