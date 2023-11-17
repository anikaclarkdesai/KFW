import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ShankShallom extends Melee{

	public ShankShallom() {
		super("Shank Shallom", 0, 2, 1,new ImageIcon(""));
		// TODO Auto-generated constructor stub
	}
	public ShankShallom(int x, int y) {
		super(x, y, " Shank Shallom", 1, 0, 1, new ImageIcon ("knife-removebg-preview.png"));
		// TODO Auto-generated constructor stub
	}
	public void attack(Graphics g2d){
		g2d.drawImage(super.getImg().getImage(), super.getX()+70 ,super.getY()+50, 100,100 ,null);
		
	}
}
