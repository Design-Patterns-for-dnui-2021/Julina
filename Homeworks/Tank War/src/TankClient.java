package tank_war;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;


public class TankClient extends Frame {
		public static final int GAME_WIDTH = 800;
		public static final int GAME_HEIGHT = 600;
	
		Tank myTank = new Tank(50, 50, true, this);
		Tank enemyTank = new Tank(100, 100, false, this); 

		Image offScreenImage = null;
		
		public static void main(String[] args) {
			TankClient tc = new TankClient();
			tc.launchFrame();
		}
	    
		public void launchFrame() { 
			this.setLocation(300, 50); 
			this.setSize(GAME_WIDTH, GAME_HEIGHT); 
			this.setTitle("TankWar"); 
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) { 
					System.exit(0);
			}
		});   
			
			this.setResizable(false); 
			this.setBackground(Color.GREEN);
			
			for(int i = 0; i < 10; i++) {
	            Tank.add(new Tank(50 + 40 * (i + 1), 50, false, this));
	        }

			this.addKeyListener(new KeyMonitor()); 
			setVisible(true);
			new Thread(new PaintThread()).start();
			}
		
	
		public void paint(Graphics g) { 
			g.drawString("missiles count: " + missiles.size(), 10, 50);
	        g.drawString("explodes count: " + explodes.size(), 10, 70);
	        
			for int (i = 0; i < missiles.size(); i++) { 
				Missile m = missiles.get(i); 
				m.hitTank(enemyTank); 
				m.draw(g); 
		
			} 
			
			for(int i = 0; i < explodes.size(); i++) { 
				Explode e = explodes.get(i); 
				e.draw(g); 
			}
			
			myTank.draw(g); 
			enemyTank.draw(g); 
			} 
			
			
		public void update(Graphics g) {
			if(offScreenImage == null) {
			offScreenImage = this.createImage(GAME_WIDTH,
			GAME_HEIGHT);
			}	
			
		Graphics gOffScreen = offScreenImage.getGraphics();
		
		Color c = gOffScreen.getColor(); 
		gOffScreen.setColor(Color.GREEN); 
		gOffScreen.fillRect(0, 0, GAME_WIDTH, GAME_HEIGHT); 
		gOffScreen.setColor(c);
		print(gOffScreen); 
		g.drawImage(offScreenImage, 0, 0, null);
		}
		
			
		private class PaintThread implements Runnable {
			public void run() {
				while(true) { repaint(); 
				try {
					Thread.sleep(50);
					} catch (InterruptedException e) { 
						e.printStackTrace();
					}
				}
			}
			
		private class KeyMonitor extends KeyAdapter {
			public void keyPressed(KeyEvent e) { 
				myTank.KeyPressed(e);
			}

			public void keyReleased(KeyEvent e) { 
					myTank.keyReleased(e);
			}
		}

	}
}					

	