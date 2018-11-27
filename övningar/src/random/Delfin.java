package random;

public class Delfin extends Däggdjur{
	
	int vikt;
	
	public Delfin () {
		hjärnstorlek = 4;

	}
	
	public Delfin (int vikt) {
		this();
		this.vikt = vikt;
	}
	
	
	@Override
	public void andas() {
		super.andas();
		System.out.println("Delfinen andas");
	}

}
