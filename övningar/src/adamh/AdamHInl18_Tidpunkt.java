package adamh;

public class AdamHInl18_Tidpunkt {
	
	private int hour;
	private int minute;
	
	public AdamHInl18_Tidpunkt(int h, int m) {
		
		setTidpunkt(h, m);
		
	}
	
	public void setTidpunkt(int h, int m) {
		
		if (h >= 0 && h <= 24  &&  m >= 0 && m <= 60) {
			hour = h;
			minute = m;
		} else {
			System.out.println("Felaktid tid");
		}
		
	}
	
	@Override
	public String toString() {
		return "" + hour + ":" + minute;
		
	}

}