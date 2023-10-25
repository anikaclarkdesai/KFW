import java.util.ArrayList;

public class Jability extends Weapon{

	public Jability() {
		super("ressurection",0,5,1);
		
	}
	public Jability(String nam, int dam,int hea ,int lev) {
		super(nam, dam, hea, lev);
	}
	public String name() {
		return super.getName();
	}
	public int health() {
		return super.getHealth();
	}
	public int damge() {
		return super.getDamage() ;
	}
public int level() {
	return super.getLevel();
}
}
	



