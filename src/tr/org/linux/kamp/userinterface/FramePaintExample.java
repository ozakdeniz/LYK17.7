package tr.org.linux.kamp.userinterface;

import java.awt.Color;
import javax.swing.JFrame;

public class FramePaintExample {
	
	public static void main(String[] args) {
		PaintPanel panel= new PaintPanel();
		
		JFrame frame = new JFrame ();
		frame.setTitle("Paint Example");
		frame.setContentPane(panel);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
