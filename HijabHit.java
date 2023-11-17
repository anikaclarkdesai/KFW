import java.awt.Graphics;

import javax.swing.ImageIcon;

public class HijabHit extends Melee{

	public HijabHit() {
		super("Hijab Hit", 2, 0, 1, new ImageIcon ("placeholder.png"));
		// TODO Auto-generated constructor stub
	}
	public HijabHit(int x, int y) {
		super(x, y, " HijabHit", 1, 0, 1, new ImageIcon ("punch.gif"));
		// TODO Auto-generated constructor stub
	}
	public void attack(Graphics g2d){
		g2d.drawImage(super.getImg().getImage(), super.getX() ,super.getY()-200, 400,400 ,null);
		
	}

}