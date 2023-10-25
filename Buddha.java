import javax.swing.ImageIcon;

public class Buddha extends Character {
	public Buddha() {
		super(1200,300,200,200,new ImageIcon("monk.png"),2,2,2,2, new Weapon());
	}
	public Buddha(int x,int y) {
		super(x,y,200,200,new ImageIcon("monk.png"),2,2,2,5);
		super.setAbility(new Nirvana());
		super.setAbility(new SinkHole(300,300));
		super.setAbility(new MeditationMelee(300,300));
		super.setAbility(new ZenZap(300,300));
		
	}
	public String toString() {
		return "Im a kungfu wizard of Buddha ";
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
