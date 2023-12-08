import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	private static final int WIDTH =1800;
	private static final int HEIGHT=1600;
	
	public Main() {
		super("KungFuWizards");
		setSize(WIDTH, HEIGHT);
		Game play = new Game();
		((Component) play).setFocusable(true);
		
		Color RoyalBlue = new Color(22,13,193);
		
		
		setBackground(RoyalBlue);
		
		
		getContentPane().add(play);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
			//	throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
				play.createsvaefile();
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				//throw new UnsupportedOperationException("Unimplemented method 'windowClosing'");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				//throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				//throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				//throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				//throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
			//	throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
			}});

		}
	

	public static void main(String[] args) {
		Main run = new Main();
		

	}


}

