package adamh;

public class AdamHInl11_Citat {
	
//	Declare each String
	private String citat1;
	private String citat2;
	private String citat3;
	
//	I create the empty constructor
	public AdamHInl11_Citat() {
	}
	
//	I create the constructor with two arguments
	public AdamHInl11_Citat(String citat2, String citat3) {
		this.citat2 = citat2;
		this.citat3 = citat3;
			
	}

//	Getters and setters
	public String getCitat1() {
		return citat1;
	}

	public void setCitat1(String citat1) {
		this.citat1 = citat1;
	}

	public String getCitat2() {
		return citat2;
	}

	public void setCitat2(String citat2) {
		this.citat2 = citat2;
	}

	public String getCitat3() {
		return citat3;
	}

	public void setCitat3(String citat3) {
		this.citat3 = citat3;
	}

}
