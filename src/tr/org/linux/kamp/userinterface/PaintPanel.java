package tr.org.linux.kamp.userinterface;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

public class PaintPanel extends JPanel{
	
	private Box box;
	
	public PaintPanel() {
		box = new Box(Color.BLACK);
		System.out.println("Kutu yaratıldı");
		startMovement();
		//startMovementWithoutThread();
		System.out.println("kutu hareketi başladı");
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d= (Graphics2D) g;
		g2d.setColor(box.getColor());
		g2d.fillRect(box.getX(), box.getY(), box.getWidth(), box.getHeight());
		
	}
	
	private void startMovementWithoutThread() {
		while (true) {
			System.out.println("kutu su anda "+box.getX()+ " pozisyonunda");
			box.setX(box.getX()+5);
			repaint();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	private void startMovement() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Random rand = new Random();
				int x,y;
				while(true) {
					x = rand.nextInt(600);
					y = rand.nextInt(600);
					box.setColor(Color.RED);
					box.setX(x);
					box.setY(y);
					repaint();
					try {
						Thread.sleep(50);
					}catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				
			}
		}).start();
	}


}
