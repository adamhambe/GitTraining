package övningar;

public class Övning_14 {

	public static void main(String[] args) {
		int earthRadius = 6371;
		double l1 = (130)/2;
		double l2 = Math.sqrt(Math.pow(earthRadius, 2) - Math.pow(l1,  2));
		double h = (earthRadius - l2) * 1000;
			
		System.out.printf("Kabeln ligger på djupet %.2fm", h);
		
	}

}
