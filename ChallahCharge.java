import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ChallahCharge extends Melee{

	public ChallahCharge() {
		super("Challah Charge", 2, 0, 1, new ImageIcon(""));
		// TODO Auto-generated constructor stub
	}
	public ChallahCharge(int x, int y) {
		super(x, y, " Challah Charge", 1, 0, 1, new ImageIcon ("bread-removebg-preview.png"));
		// TODO Auto-generated constructor stub
	}

	public void attack(Graphics g2d){
		g2d.drawImage(super.getImg().getImage(), super.getX()+70 ,super.getY()+50, 100,100 ,null);
		
	}

}

