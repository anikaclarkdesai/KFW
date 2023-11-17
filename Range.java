import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Range extends Weapon{
public int x,y,h,w,speed, dx,dy, ldx;
	
	public Range(String nam, int dam,int hea ,int lev, ImageIcon i) {
		// TODO Auto-generated constructor stub
		super(nam, dam, hea, lev, i);
			
	}
	public Range(int x, int y, int dx, int dy , String nam, int hea,int dam, int lev, ImageIcon imageIcon) {
		super(x, y,dx,dy,nam, hea, dam, lev, imageIcon);
	}


    public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
