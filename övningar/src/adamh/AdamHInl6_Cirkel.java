package adamh;



public class AdamHInl6_Cirkel {
	
//	First I declare the variable that I will use in the code
	double radie;
	
//	The contructor
	public AdamHInl6_Cirkel(double radie) {
		this.radie = radie;
	}  
	
//	Getters
	public double avläsArea() {
		
		return Math.PI * Math.pow(radie, 2);
		
	}
	
	
	public double avläsOmkrets() {
		
		return 2 * radie * Math.PI;

	}
	
	public double avläsDiameter() {
		
		return radie * 2;
	}
}
