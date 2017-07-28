package tr.org.linux.kamp.userinterface;

import javax.swing.JFrame;/*jframe yazınca otomatikmen gelir swing 
kütüphanesi görsellerin bulunduğu kütüphane*/


public class FrameExample {//frame=çerçeve
	
	public static void main(String[] args) {
		
		JPanelExample jPanel = new JPanelExample();//çerçevenin üstüne alt taban panel eklemek için oluşturuyoruz
		
		JFrame/*1.çerçeve oluşturan obje*/ frame =new JFrame() ;//frame duvarsa panel karatahtadır
		
		frame.setSize(640, 480);//çözünürlüğü ayarlıyoruz
		frame.setContentPane(jPanel);//Jpanel sınıfına tanımladığımız özellikleri buraya çeker.
		frame.setLocation(500, 500);//nerede olacağını belirliyoruz koordinat
		frame.setResizable(false);//çerçevenin büyüklüğünü değişmesini engelliyoruz
		frame.setTitle("Başlık");//çerçeveye başlık ekliyoruz
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*pencereyi kapattığımızda ne olcağını 
		belirliyoruz ve pencereyi kapattığında kapatı seçiyoruz*/
		frame.setVisible(true);//çerçeve yi görünür kıldık
		jPanel.repaint();
		
		/*2 JPanel
		 * 3 JLAbel
		 * 4 JButton
		 * 5 JTextfield*/
	}

}
