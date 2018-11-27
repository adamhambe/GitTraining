package övningar;

import javax.swing.JOptionPane;

public class Övning_17 {

	public static void main(String[] args) {
		
		Övning_16_Bil bil1 = new Övning_16_Bil();
		bil1.fabrikat = "Volvo";
		bil1.motoreffekt = 500;
		bil1.registreringsnummer = "123ABC";
		bil1.tjänstevikt = 1000;
		bil1.årsmodell = 1990;
		
		Övning_16_Bil bil2 = new Övning_16_Bil();
		bil2.fabrikat = "Saab";
		bil2.motoreffekt = 10000;
		bil2.registreringsnummer = "666BBB";
		bil2.tjänstevikt = 3;
		bil2.årsmodell = 2099;
		
		JOptionPane.showMessageDialog(null, 
				"Fabrikat: " + bil1.fabrikat + "\n" +
				"Motoreffekt: " + bil1.motoreffekt + "\n" +
				"Registreringsnummer: " + bil1.registreringsnummer + "\n" +
				"Tjänstevikt: " + bil1.tjänstevikt + "\n" +
				"Årsmodell: " + bil1.årsmodell + "\n");
		JOptionPane.showMessageDialog(null, 
				"Fabrikat: " + bil2.fabrikat + "\n" +
				"Motoreffekt: " + bil2.motoreffekt + "\n" +
				"Registreringsnummer: " + bil2.registreringsnummer + "\n" +
				"Tjänstevikt: " + bil2.tjänstevikt + "\n" +
				"Årsmodell: " + bil2.årsmodell + "\n");
	}

}
