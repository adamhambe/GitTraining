package random;

public class Bil {
	
//	Klassvariabler
	static int bilinstanser = 0; 		//Klassvaribel som räknas upp med varje skapad bil. 
	static final int MAX_VIKT_PB = 3500;// En konstant som sätter maxvikten för vad en personbil får väga. 
	
//	Instansvariabler
	private String regno;
	private String märke;
	private String modell;
	private int motoreffekt;
	private int sittPlatser;
	private int vikt;
	
	
//	Konstruktor som tar alla parametrar
public Bil(String regno, String märke, String modell, int motoreffekt, int sittPlatser, int vikt) {
//	super();
	
	/* I de fall jag lagt kontrollfunktioner i setmetoderna har jag valt att gå "via" dem för att sätta värdena. 
	 * På så sätt slipper jag ändra på flera ställen i koden om man skulle vilja ändra i kontrollfunktionerna 
	 * (ex om det plötsligt tillkommer en MIN_VIKT).
	 */

	setRegno(regno); // Går via setmetod för att kolla att regno är ok. 
	this.märke = märke;
	this.modell = modell;
	this.motoreffekt = motoreffekt;
	this.sittPlatser = sittPlatser;
	setVikt(vikt); //Går via setmetod för att kolla att vikt är ok. 
	
	bilinstanser++; //Ökar antalet instansierade bilar med ett så att vi vet hur många objekt vi instansierat
}

public static int getBilinstanser() {
	return bilinstanser;
}



@Override
public String toString() {
	return String.format("En %s modell %s med registreringsnummer %s,  %d hästkrafter,  %d sittplatser och en vikt på %d kg.", 
			märke, modell, regno, motoreffekt, sittPlatser, vikt);
}

public String getRegno() {
	
	return regno;
}

public void setRegno(String regno) {
	
	//kallar metoden checkregno. Om regnumret är ok tilldelas instansvariabeln värdet som kommer från konstruktorn.
	if (checkRegNo(regno)) {
		this.regno = regno;
	}
	
}

public String getMärke() {
	return märke;
}

public void setMärke(String märke) {
	this.märke = märke;
}

public String getModell() {
	return modell;
}

public void setModell(String modell) {
	this.modell = modell;
}

public int getMotoreffekt() {
	return motoreffekt;
}

public void setMotoreffekt(int motoreffekt) {
	this.motoreffekt = motoreffekt;
}

public int getSittPlatser() {
	return sittPlatser;
}

public void setSittPlatser(int sittPlatser) {
	this.sittPlatser = sittPlatser;
}

public int getVikt() {
	return vikt;
}

public void setVikt(int vikt) {
	
	if (vikt > 0 && vikt <= MAX_VIKT_PB) {
		this.vikt = vikt;
	} else {
		this.vikt = 0;
	}

}


private boolean checkRegNo (String regToCheck) {
	
	/*  Metoden är satt till "private" då den enbart är tänkt at fungera inom klassen för att testa om ett regnummer är giltigt.
	 *  Det finns ingen anledning för utomstående klasser att nå denna metod 
	 */
	
	
	//Kollar så att regnumret följer konventionen för registreringsnummer
	if (Character.isLetter(regToCheck.charAt(0)) && Character.isLetter(regToCheck.charAt(1)) && Character.isLetter(regToCheck.charAt(2)) && 
			Character.isDigit(regToCheck.charAt(3)) && Character.isDigit(regToCheck.charAt(4)) && Character.isDigit(regToCheck.charAt(5))) {
		return true;
	}
	
	return false; //Returnerar falskt om inte konventionen ovan är ok. 
	
}

	
	
	
	
	


}
