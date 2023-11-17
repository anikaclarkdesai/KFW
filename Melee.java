import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Melee extends Weapon{
	public Melee(String nam, int dam,int hea ,int lev, ImageIcon i) {
		// TODO Auto-generated constructor stub
		super(nam, dam, hea, lev, i);
	}
	public Melee(int x, int y, String nam,int dam, int hea, int lev, ImageIcon imageIcon) {
		super(x, y,nam, dam,hea,  lev, imageIcon);
	}
    public void attack(Graphics g2d) {
    }


}
