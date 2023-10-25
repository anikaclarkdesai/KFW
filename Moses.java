import javax.swing.ImageIcon;

public class Moses extends Character{
	
	public Moses() {
		super(600,300,200,200,new ImageIcon("muslimwo.png"),2,2,3,4, new Weapon());
	}
	public Moses(int x,int y) {
		super(x,y,200,200,new ImageIcon("muslimwo.png"),2,2,2,5);
		super.setAbility(new HijabHit());
		super.setAbility(new HalalHurricane(300,300));
		super.setAbility(new MeccaMirage());
		super.setAbility(new JinnJolt(300,300));
		
	}
	public String toString() {
		return "Im a kungfu wizard of Islam ";
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
