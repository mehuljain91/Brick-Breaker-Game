package brickBreaker;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Paddle extends Graphic {
	private int dx;
	
	public Paddle() {
		initPaddle();
	}
	
	private void initPaddle() {
		loadImage();
		getImageDimension();
		
		resetState();
	}
	
	private void loadImage() {
		var ii = new ImageIcon("src/resourse/Paddle.png");
		image = ii.getImage();
	}
	
	void move() {
		x += dx;
		
		if(x <= 0) {
			x = 0;
		}
		
		if(x >= Regular.WIDTH - imageWidth) {
			x = Regular.WIDTH - imageWidth;
		}
	}
	
	void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT) {
			dx = -1;
		}
		
		if(key == KeyEvent.VK_RIGHT) {
			dx= 1;
		}
	}
	
	void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		
		if(key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
	}
	
	private void resetState() {
		x = Regular.PADDLE_X;
		y = Regular.PADDLE_Y;
	}
}
