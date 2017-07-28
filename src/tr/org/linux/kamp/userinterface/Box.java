package tr.org.linux.kamp.userinterface;

import java.awt.Color;

public class Box {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	


	public Box (Color color) {
		width =100;
		height = 100;
		this.color = color;
		
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
