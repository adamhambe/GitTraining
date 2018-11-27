package adamh;

public class AdamHInl6_Kvadrat extends AdamHInl6_Rektangel {
	
//	Constructor
	public AdamHInl6_Kvadrat(double a) {
//		I have to use the super keyword to make sure the arguments correspond to the amount of parameters in the superclass. 
//		In this case I say that b = a (the a that I call in using this constructor)
		super(a, a);
		this.a = a;
		
	}

}
