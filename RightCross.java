import java.awt.Graphics;

import javax.swing.ImageIcon;

public class RightCross extends Melee{

	public RightCross() {
		super("Right Cross", 1, 0, 1, new ImageIcon ("placeholder.png"));
		// TODO Auto-generated constructor stub
	}
	public RightCross(int x, int y) {
		super(x, y, " Shank Shallom", 1, 0, 1, new ImageIcon ("punch.gif"));
		// TODO Auto-generated constructor stub
	}
	public void attack(Graphics g2d){
		g2d.drawImage(super.getImg().getImage(), super.getX() ,super.getY()-200, 400,400 ,null);
		
	}
}
