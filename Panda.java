import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Panda extends Character{
	public Panda() {
		super(200,300,200,200,new ImageIcon("kfpanda (2).png"),2,2,2,2, new Weapon());
	}
	public String toString() {
		return "kungfu and dumplings" + super.getDa() + " damage";
	
	}
	
}
