import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Character {

	private int x,y,w,h, dx, dy;
	private int hp, da;
	private ImageIcon img;
	private Weapon wep;
	public boolean ishovering, selected;
	private ArrayList <Weapon> ability;
	
	
	public Character(int xV, int yV, int width, int height, ImageIcon i, int dxV, int dyV, int health, int damage) {
		x=xV;
		y=yV;
		w=width;
		h=height;
		img=i;
		dx=dxV;
		dy=dyV;
		hp=health;
		da= damage;
	setAbility(new ArrayList <Weapon> ());
		
	}
	public Character(int xV, int yV, int width, int height, ImageIcon i){
	x=xV;
	y=yV;
	w=width;
	h=height;
	img=i;
}
	public Character(int xV, int yV, int width, int height, ImageIcon i, int dxV, int dyV, int health, int damage, Weapon weapon) {
		x=xV;
		y=yV;
		w=width;
		h=height;
		img=i;
		dx=dxV;
		dy=dyV;
		hp=health;
		da= damage;
		wep=weapon ;
		
	}

	public void setAbility(Weapon w) {
		boolean drawonce=true;
		ability.add(w);
		
		
	}
		public void drawChar(Graphics g2d) {
			g2d.drawImage(img.getImage(), x, y, w,h, null);
			
		}
		
		public String toString() {
			return "default Char";
		}
		public String health() {
			return "health";
		}
		public String damge() {
			return "damage: " ;
		}
		public String Weapon() {
			return "Ability: ";
		}
		public boolean hover(int mouseX, int mouseY) {
			if((getY()<=mouseY&&mouseY<=getY()+ getH())&&(getX()<= mouseX&& mouseX<=getX()+getW())) {
				return true;
			}
			return false;
		}
		
	public boolean gethovering() {
		return ishovering;
	}
	public boolean selection() {
		return selected;
	}
	public void drawhoverRect(Graphics g2d) {
		Color transgrey = new Color(27, 27, 27,150);
		g2d.setColor(transgrey);
		//g2d.setColor(Color.green);
		g2d.fillRoundRect(getX()-10,  getY()-10, getW()+20, getH()+20, 30, 30);
		
		g2d.setColor(Color.white);
		
		g2d.setFont(new Font("Broadway", Font.BOLD, 35));
	}
	public void selectstring(Graphics g2d) {
		// TODO Auto-generated method stub
		g2d.setColor(Color.green);
		g2d.fillRoundRect(getX()-10,  getY()-10, getW()+20, getH()+20, 30, 30);
		g2d.setFont(new Font("Broadway", Font.BOLD, 45));
		g2d.setColor(Color.white);
		g2d.drawString(toString(),400,50);
		g2d.setFont(new Font("Broadway", Font.BOLD, 50));
		g2d.drawString("Selected", getX()-20, getY()+250);
		
		
		
		
	}
	public void skilldisplay(Graphics g2d) {
		Color transgrey = new Color(27, 27, 27,150);
		g2d.setColor(transgrey);
		g2d.fillRoundRect(300,  0, 1000, 300, 30, 30);
		g2d.setColor(Color.white);
		g2d.setFont(new Font("Broadway", Font.BOLD, 45));
		g2d.drawString(toString(),400, 50);
		g2d.setFont(new Font("Broadway", Font.BOLD, 35));
		
		
		g2d.drawString(health(),400,100);
		g2d.drawString(Weapon(),800,100);
		g2d.setFont(new Font("Broadway", Font.BOLD, 20));
		
		
		
		
		if(getAbility()!=null) {
		for(Weapon A: getAbility()) {
			
		//	A.drawweapons(g2d);
			g2d.drawString(getAbility().get(0).getName()+":    Control: I", 800, 125);
			g2d.drawString(getAbility().get(1).getName()+":    Control: J", 800,175);
			g2d.drawString(getAbility().get(2).getName()+":    Control: K ", 800, 225);
			g2d.drawString(getAbility().get(3).getName()+":    Control: L",800, 275);
			}
			
			}
		
	}
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int X) {
		x+=X;
	}

	public int getY() {
		return y;
	}

	public void setY(int Y) {
		y+=Y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public ImageIcon getImg() {
		return img;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}

	public Weapon getWep() {
		return wep;
	}

	public void setWep(Weapon wep) {
		this.wep = wep;
	}
	public ArrayList<Weapon> getAbility(String string) {
		return ability;
	}
	public ArrayList <Weapon> getAbility() {
		return ability;
	}
	public void setAbility(ArrayList <Weapon> ability) {
		this.ability = ability;
	}

	
}
