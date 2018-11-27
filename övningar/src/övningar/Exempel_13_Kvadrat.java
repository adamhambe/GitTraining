package övningar;

public class Exempel_13_Kvadrat {
//	Instansvariabel
	private double sida;
//	Instansmetoder
	public void sättSida (double s) {
		if (s >= 0)
			sida = s;
		else
			throw new IllegalArgumentException ("Negativt värde");
	}
	public double avLäsSida() {
		return sida;
	}
}
