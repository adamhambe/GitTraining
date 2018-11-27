package adamh;



public class AdamHInl10Main_ObsDemo extends AdamHInl10_Observation {	
	
	public static void main(String[] args) {
//		I instantiate b by calling the AdamHInl10_Obsertation class
		AdamHInl10_Observation b = new AdamHInl10_Observation();
//		I set each variable
		b.setNr(8431);
		b.setTim(19);
		b.setMin(30);
		b.setTemp(12.5);
		b.setVindhast(2.5);
		b.setVindriktning(80);
//		I use getters and present the result
		System.out.println("Observationer kl." + b.getTim() + ":" + b.getMin() + " var temperaturen: " + b.getTemp());
		System.out.println("Vindriktning: " + b.getVindriktning() + "\n" + "Väderstreck: " + b.Väderstreck());
		
	}

}
