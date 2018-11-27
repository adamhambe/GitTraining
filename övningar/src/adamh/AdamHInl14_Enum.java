package adamh;

public enum AdamHInl14_Enum {
	
	I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
	
	private final int val;
	
	AdamHInl14_Enum(int value) {
		val = value;
	}
	
	public int getValue() {
		return val;
	}
	
}
