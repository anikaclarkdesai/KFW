import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Crucifiction extends Melee{

	public Crucifiction() {
		super("Crucifiction", 2, 0, 1,  new ImageIcon ("cross.png"));
		// TODO Auto-generated constructor stub
	}
	public Crucifiction(int x, int y) {
		super(x, y, "Crucifiction", 2, 0, 1, new ImageIcon ("cross.png"));
		// TODO Auto-generated constructor stub
	}
	public void attack(Graphics g2d){
		g2d.drawImage(super.getImg().getImage(), super.getX() ,super.getY(), 200,200 ,null);
		
	}
}
