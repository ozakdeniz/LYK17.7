package tr.org.linux.kamp.userinterface;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample extends JPanel{
	
	private JLabel label;
	private WhiteLabel centerLabel;
	private WhiteLabel northLabel;
	private WhiteLabel southLabel;
	private WhiteLabel eastLabel;
	private WhiteLabel westLabel;
	
	
	public JPanelExample(){
		setLayout(new BorderLayout());
		setBackground(Color.GRAY);
		//System.out.println(getLayout());
		
		centerLabel = new WhiteLabel("CENTER");
		northLabel = new WhiteLabel("North Remembers");
		southLabel = new WhiteLabel("South");
		eastLabel = new WhiteLabel("East");
		westLabel = new WhiteLabel("Wild wild west");

		/*label.setForeground(Color.DARK_GRAY);
		label.setBounds(5, 5, 300, 300);
		label.setBorder(BorderFactory.createLineBorder(Color.BLACK));*/
		add(centerLabel, BorderLayout.CENTER);
		add(northLabel, BorderLayout.NORTH);
		add(southLabel, BorderLayout.SOUTH);
		add(eastLabel, BorderLayout.EAST);
		add(westLabel, BorderLayout.WEST);
		
		label = new JLabel("");
		label.setForeground(Color.WHITE);
		label.setBounds(10, 10, 500, 300);
		label.setBorder(BorderFactory.createLineBorder(Color.RED));
		add(label);
	}

}
