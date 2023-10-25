import javax.swing.ImageIcon;

public class Abraham extends Character {
	
	public Abraham() {
		super(300,300,200,200,new ImageIcon("jew.png"),2,2,6,1, new Weapon());
	}
	public Abraham(int x,int y) {
		super(x,y,200,200,new ImageIcon("jew.png"),2,2,2,5);
		super.setAbility(new ChallahCharge(300,300));
		super.setAbility(new ShankShallom(300,300));
		super.setAbility(new NSoD(300,300));
		super.setAbility(new JewJab(300,300));
		
	}
	public String toString() {
		return "Im a kungfu wizard of Judaism ";
	
	}
	public String health() {
		return "health: "+ super.getHp();
	}
	public String damge() {
		return "damage: "+ super.getDa() ;
	}
	public String Weapon() {
		return "Abilities: ";
	}
}
