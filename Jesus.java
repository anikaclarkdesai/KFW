import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Jesus extends Character {
	public Jesus() {
		super(900,300,200,200,new ImageIcon("jesus.png"),2,2,2,5, new Weapon());
	}
	public Jesus(int x,int y) {
		super(x,y,200,200,new ImageIcon("jesus.png"),2,2,2,5);
		super.setAbility(new Crucifiction(300,300));
		super.setAbility(new Ressurection());
		super.setAbility(new RightCross(300,300));
		super.setAbility(new HolySpiriSprawl());
		
	}
	public String toString() {
		return "Im a kungfu wizard of Jesus " ;
	}
	public String health() {
		return "health: "+ super.getHp();
	}
	public String damge() {
		return "damage: "+ super.getDa() ;
	}
	public String Weapon() {
		return "Abilities: " ;
	}

}
