package tr.org.linux.kamp.userinterface;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WhiteLabel extends JLabel {
	
	public WhiteLabel (String text) {
		super(text);
		setForeground(Color.CYAN);//Yazının olduğu plan yazının rengi
		setBorder(BorderFactory.createLineBorder(Color.RED));//Çerçeve çağırıp çizgi çerçevesi renklendiriyoruz 
		setHorizontalTextPosition(SwingConstants.CENTER);
		setVerticalAlignment(SwingConstants.CENTER);
		
	}

}
