package adamh;

public class AdamHInl15_Elev extends AdamHInl15_Person implements Comparable<AdamHInl15_Elev> {
	
	private String name;
	private Integer birthYear;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public int compareTo(AdamHInl15_Elev year) {
		return this.birthYear.compareTo(year.getBirthYear());
	}

}