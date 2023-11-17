import java.awt.Graphics;

import javax.swing.ImageIcon;

public class MeditationMelee extends Melee{

	public MeditationMelee(int x, int y) {
		super(x, y, "Meditation Melee", 1, 0, 1, new ImageIcon ("aura-removebg-preview.png"));
		// TODO Auto-generated constructor stub
	}
	public void attack(Graphics g2d){
		g2d.drawImage(super.getImg().getImage(), super.getX()-100 ,super.getY()-150, 400,400 ,null);
	}

}
