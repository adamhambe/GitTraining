package adamh;

public class AdamHInl11Main {

	public static void main(String[] args) {
		
//		I instantiate the a object by calling the AdamHInl11_Citat() class
		AdamHInl11_Citat a = new AdamHInl11_Citat();
//		I set the String by calling the setCitat1 method
		a.setCitat1("Jag skall inte rita bilder av nakna knvinnor i klassen.");
//		I iterate and get the String I set above
		for (int i = 0; i < 10; i++)
			System.out.println(a.getCitat1());
		
//		I instantiate the b object by calling the AdamHInl11_Citat() class. I also set the respective strings in the constructor.
		AdamHInl11_Citat b = new AdamHInl11_Citat("Jag skall inte skrika \"Elden är lös\" i ett fullt klassrum", "Jag skall inte göra fotostatkopior av min rumpa");
//		I iterate and get the Strings I set above
		for (int i = 0; i < 20; i++)
			System.out.println(b.getCitat2());
		for (int i = 0; i < 20; i++)
			System.out.println(b.getCitat3());
		
	}
	
}
