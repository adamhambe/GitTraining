package random;

public class Däggisar {

	public static void main(String[] args) {

		Delfin delfin = new Delfin();
		delfin.andas();
		System.out.println(delfin.hjärnstorlek);
		
		Delfin delfin2 = new Delfin(36);
		System.out.println(delfin2.vikt);
		
	}

}
