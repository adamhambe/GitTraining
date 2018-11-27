package övningar;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Övning_18_MittExempelDemo2 {

	public static void main(String[] args) {
		
		Övning_18_MittExempel2 fönster = new Övning_18_MittExempel2();
		
		fönster.setTitle("En fil");
		WindowListener l = new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
				System.exit(0);
			}
		};
		
		fönster.addWindowListener(l);
		fönster.pack();
		fönster.setVisible(true);
		
	}

}