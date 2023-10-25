import javax.swing.ImageIcon;

public class SinkHole extends Range{

	public SinkHole() {
		super("Siddhartha Sink Hole", 0, 2, 1, new ImageIcon (""));
		// TODO Auto-generated constructor stub
	}
	public SinkHole(int xV, int yV){
		super(xV,yV,2,2,"Sink Hole" ,1,0,1,new ImageIcon("sinkhole.png" ));

	}
}
