import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Weapon {

	private int damage, level, health, xV, yV, dxV, dyV;
	private String name;
	public boolean yes;
	public ArrayList<Jability> jability;
	public ImageIcon img;
	
	public Weapon() {
		name="1";
		damage= 1;
		health=1;
		level=1;
	//	jability= Jabilities();
		}
	
	public Weapon( String nam, int dam,int hea ,int lev) {
	name=nam;
	damage= dam;
	health=hea;
	level=lev;
	
	}


	
	public Weapon(String nam, int dam, int hea, int lev, ImageIcon i) {
		// TODO Auto-generated constructor stub
		name=nam;
		damage= dam;
		health=hea;
		level=lev;
		img= i;
	}
	public Weapon(int x, int y,String nam, int dam, int hea, int lev, ImageIcon i) {
		// TODO Auto-generated constructor stub
		xV=x;
		yV= y;
		name=nam;
		damage= dam;
		health=hea;
		level=lev;
		img= i;
	}
	 public Weapon(int x, int y, int dx, int dy, String nam, int dam, int hea, int lev, ImageIcon i){
		xV=x;
		yV=y;
		dxV=dx;
		dyV=dy;
		name=nam;
		damage=dam;
		health=hea;
		level=lev;
		img=i;
	 }
	public String name() {
		return "default Char";
	}
	public int health() {
		return getHealth();
	}

	public int damge() {
		return getDamage() ;
	}
	public int level() {
	return getLevel();
}
	public int getDamage() {
		return damage;
	}
	
	public void types() {
		// TODO Auto-generated method stub
		System.out.println(name()+ " damage:" +damge()+ " health:"+health()+" level:"+ level());
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isYes() {
		return yes;
	}

	public void setYes(boolean yes) {
		this.yes = yes;
	}

	public void drawweapons(Graphics g2d) {
		// TODO Auto-generated method stub
		g2d.drawImage(getImg().getImage(), getX(),getY(), 10, 10, null);
	}

	
	public int getDx() {
		return xV;
	}
	public int getDy(){
		return yV;
	}
		public void setDx(int xV) {
		this.xV= xV;
	}
	
			public void setDy(int yV) {
		this.yV= yV;
	}

	

	public int getY() {
		return yV;
	}

	public int getX() {
		return xV;
	}

	public ImageIcon getImg() {
		return img;
	}

	
	public void setX(int x) {
		this.xV = x;
	}


	
	public void setY(int y) {
		this.yV = y;
	}

	public void atttack(Graphics g2d){
		g2d.drawImage(getImg().getImage(), getX()-100, getY()-150, 400,400 ,null);

	}
}
