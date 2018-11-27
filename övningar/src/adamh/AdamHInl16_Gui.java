package adamh;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class AdamHInl16_Gui extends JFrame {
	
	private JCheckBox checkbox;
	private JButton button;
	
	public AdamHInl16_Gui() {
		super("Checkbox program");
		setLayout(new FlowLayout());
		
		checkbox = new JCheckBox("Kryssruta1");
		add(checkbox);
		
		button = new JButton("Button");
		add(button);
		
		HandlerClass handler = new HandlerClass();
		checkbox.addItemListener(handler);
		
	}
	
	private class HandlerClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			if(checkbox.isSelected())
				button.setEnabled(false);
			else
				button.setEnabled(true);
			
		}
		
	}
	
}
