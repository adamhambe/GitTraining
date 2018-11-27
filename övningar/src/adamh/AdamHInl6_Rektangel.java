package adamh;

public class AdamHInl6_Rektangel {
	
//	Declarations
	double a;
	double b;
	
//	Constructor
	public AdamHInl6_Rektangel(double a, double b) {
		
		this.a = a;
		this.b = b;
		
	} 
	
//	Getters
	public double avläsArea() {
		return a * b;
	}
	
	public double avläsOmkrets() {
		return a * 2 + b * 2;
	}
	
	public double avläsDiagonal() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); 
	}

}
