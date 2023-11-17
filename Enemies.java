import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Enemies{
	private int x,y,w,h, dx, dy;
	private int hp, da;
	private ImageIcon img;
	
	
	public Enemies(int xV, int yV, int width, int height, ImageIcon i, int dxV, int dyV, int health, int damage) {
		x=xV;
		y=yV;
		w=width;
		h=height;
		img=i;
		dx=dxV;
		dy=dyV;
		hp=health;
		da= damage;
    }
    public void drawChar(Graphics g2d) {
        g2d.drawImage(img.getImage(), x, y, w,h, null);
        
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



	
}

