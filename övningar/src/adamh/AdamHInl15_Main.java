package adamh;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class AdamHInl15_Main {

	public static void main(String[] args) {
		
		List<AdamHInl15_Elev> list = new ArrayList<AdamHInl15_Elev>();
		
		AdamHInl15_Elev student1 = new AdamHInl15_Elev();
		student1.setName("Oscar");
		student1.setBirthYear(1994);
		list.add(student1);
		
		AdamHInl15_Elev student2 = new AdamHInl15_Elev();
		student2.setName("Johan");
		student2.setBirthYear(1994);
		list.add(student2);
		
		AdamHInl15_Elev student3 = new AdamHInl15_Elev();
		student3.setName("Jerry");
		student3.setBirthYear(1982);
		list.add(student3);
		
		AdamHInl15_Elev student4 = new AdamHInl15_Elev();
		student4.setName("Sofie");
		student4.setBirthYear(1987);
		list.add(student4);
		
		AdamHInl15_Elev student5 = new AdamHInl15_Elev();
		student5.setName("Andreas");
		student5.setBirthYear(1994);
		list.add(student5);

		AdamHInl15_Elev student6 = new AdamHInl15_Elev();
		student6.setName("Cemal");
		student6.setBirthYear(1991);
		list.add(student6);

		AdamHInl15_Elev student7 = new AdamHInl15_Elev();
		student7.setName("Alexander");
		student7.setBirthYear(1988);
		list.add(student7);
		
		Collections.sort(list);
		
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(currentYear - list.get(i).getBirthYear());
		}
			
	}

}
