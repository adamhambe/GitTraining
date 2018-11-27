package adamh;

public class AdamHInl10_Observation {
	
//	I declare all my variabes as private
	private int nr, tim, min;
	private double temp, vindhast, vindriktning;
	private String väderstreck;
	
//	I set the conditions for each väderstreck and initiate väderstreck there after
	public String Väderstreck() {
		if ((348.75 <= vindriktning && vindriktning <= 360)  ||  (0 <= vindriktning && vindriktning <= 11.25))
			väderstreck = "N";
		else if (11.25 <= vindriktning && vindriktning < 33.75)
	        väderstreck = "NNO";
		else if (33.75 <= vindriktning && vindriktning < 56.25)
	        väderstreck = "NO";
		else if (56.25 <= vindriktning && vindriktning <= 78.75)
	        väderstreck = "ONO";
		else if (78.75 <= vindriktning && vindriktning <= 101.25)
	        väderstreck = "O";
		else if (101.25 <= vindriktning && vindriktning <= 123.75)
	        väderstreck = "OSO";
		else if (123.75 <= vindriktning && vindriktning <= 146.25)
	        väderstreck = "SO";
		else if (146.25 <= vindriktning && vindriktning <= 168.75)
	        väderstreck = "SSO";
		else if (168.75 <= vindriktning && vindriktning <= 191.25)
	        väderstreck = "S";
		else if (191.25 <= vindriktning && vindriktning <= 213.75)
	        väderstreck = "SSV";
		else if (213.75 <= vindriktning && vindriktning <= 236.25)
	        väderstreck = "SV";
		else if (236.25 <= vindriktning && vindriktning <= 258.75)
	        väderstreck = "VSV";
		else if (258.75 <= vindriktning && vindriktning <= 281.25)
	        väderstreck = "V";
		else if (281.25 <= vindriktning && vindriktning <= 303.75)
	        väderstreck = "VNV";
		else if (303.75 <= vindriktning && vindriktning <= 326.25)
	        väderstreck = "NV";
		else if (326.25 <= vindriktning && vindriktning <= 348.75)
	        väderstreck = "NNV";
		return väderstreck;
	}
	
//	Getters and setters for the variables
	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public int getTim() {
		return tim;
	}

	public void setTim(int tim) {
		this.tim = tim;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getVindhast() {
		return vindhast;
	}

	public void setVindhast(double vindhast) {
		this.vindhast = vindhast;
	}

	public double getVindriktning() {
		return vindriktning;
	}

	public void setVindriktning(double vindriktning) {
		this.vindriktning = vindriktning;
	}

	public String getVäderstreck() {
		return väderstreck;
	}

	public void setVäderstreck(String väderstreck) {
		this.väderstreck = väderstreck;
	}


	
}
