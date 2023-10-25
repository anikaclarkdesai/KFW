import javax.swing.ImageIcon;

public class JinnJolt extends Range{
 
	public JinnJolt(){
	 super("Jinn Jolt", 1, 1, 1,new ImageIcon ("placeholder.png"));
 }
 public JinnJolt(int xV, int yV){
	super(xV,yV,2,2,"Jinn Jolt" ,1,0,1,new ImageIcon("lightning-unscreen.gif" ));

}
}
