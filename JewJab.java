import java.awt.Graphics;

import javax.swing.ImageIcon;

public class JewJab extends Melee{

	public JewJab() {
		super("Jew Jab", 1, 1, 1, new ImageIcon(""));
		// TODO Auto-generated constructor stub
	}
	public JewJab(int x, int y) {
		super(x, y, "Jew Jab", 2, 0, 1, new ImageIcon ("punch.gif"));
		// TODO Auto-generated constructor stub
	}
public void attack(Graphics g2d){
		g2d.drawImage(super.getImg().getImage(), super.getX() ,super.getY()-150, 400,400 ,null);
		
	}
}
