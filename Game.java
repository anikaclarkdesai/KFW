import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Game  extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	private BufferedImage back; 
	private ArrayList<Character>Wizards;
	private ImageIcon kf, junglebg, mazebg1;
	private boolean starter;
	ArrayList<Weapon> ability;
	ArrayList<Jability> jability;
	//weapons 
	ArrayList<Range> shoot;
	ArrayList<Melee> hit;
	ArrayList<Daze> daze;
	ArrayList<Healing> heal;
	public Weapon a;
	private Character characterchosen; 
	private boolean gameplay;
	public long time;
	public int Typestr, mazex,mazey;
	private boolean charselction;
	private int mapWidth, mapHeight;
	private long timeatpoint;
	private long currenttime, currentime;
	//enemies stuff
	Queue<Enemies> enemies;
	ArrayList<Range> et;
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		Wizards= setStartChars();
		ability = abilities();
		
		//time
		time= System.currentTimeMillis()/1000;
		Typestr=1;
		currenttime=System.currentTimeMillis()/1000;
	
		//startscreen
		starter=true;
		junglebg= new ImageIcon("junglebg.jfif");
		System.out.println(Wizards.get(2).getAbility(getName()));
	
		gameplay=false;
		charselction=true;
		
		//testorimage
		//kf= new ImageIcon("kfpanda.gif");
		//map
		mazebg1= new ImageIcon("NewMaze.png");
		mapWidth=5000;
		mapHeight=5000;

		//range shots
		shoot = new ArrayList<Range> ();
		hit = new ArrayList <Melee>();

		//enemies
		enemies= setEs();
		et= eattacks();
	}

	
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	private ArrayList <Character> setStartChars(){
		ArrayList <Character> temp= new ArrayList <Character>();
		temp.add(new Buddha(1200,300));
		temp.add(new Abraham(300,300));
		temp.add(new Jesus(900,300));
		temp.add(new Moses(600,300));
		return temp;
	}
	private ArrayList<Weapon> abilities(){
		ArrayList <Weapon> able= new ArrayList <Weapon>();
		
		return able;
	}
	private Queue<Enemies> setEs(){
		Queue <Enemies> temp= new LinkedList<>();
		temp.add(new Werewolf(300,100,2,5));
		temp.add(new Werewolf(500,500,5,2));
		temp.add(new Werewolf(900,300,3,4));

		return temp;

	}
	private ArrayList<Range> eattacks(){
		ArrayList <Range> temp= new ArrayList<Range>();
		temp.add(new eattack(100,100));
		return temp;
	}
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
		//tester for images
		//g2d.drawImage(kf.getImage(),100,100,100,100,this);
		
		if (starter&&charselction==true){
			start(g2d);
		} 
		
		if (gameplay) {
			charselction=false;
			starter=false;
			gameplay(g2d);
		}
	
		drawrange(g2d);
		drawmelee(g2d);
		
		twoDgraph.drawImage(back, null, 0, 0);
		
	}

	
	private void drawmelee(Graphics g2d) {
			for(Melee m: hit){
		if(!hit.isEmpty()) {
			
			m.attack(g2d);
			//System.out.println("should draw");
		if((System.currentTimeMillis()/1000)-timeatpoint>.15) {
		hit.remove(m);
		}
			if(hit.size()>1){	
			hit.remove(m);
		}
		
	}
}
			}
	
	
	
	private void drawrange(Graphics g2d) {
		//System.out.println("is there anything here???" +shoot.size());
		for(Range r: shoot){
			g2d.drawImage(r.getImg().getImage(), r.getX(), r.getY(), 50,50, this);
			r.ReverseHorz();
			if(r.getX()<0){
				shoot.remove(r);
			}
			if(r.getX()+10<=enemies.element().getX()+enemies.element().getW()&&r.getY()+10>enemies.element().getY()&&r.getY()+10<=enemies.element().getY()+enemies.element().getW()){
					shoot.remove(r);
					enemies.remove();
			}
		}
		
	}



	private void gameplay(Graphics g2d) {
		// TODO Auto-generated method stub
		g2d.clearRect(0,0,getSize().width, getSize().height);
		background(g2d);
		drawchosenchar(g2d);
		drawenemies(g2d);

	}



	private void drawchosenchar(Graphics g2d) {
		// TODO Auto-generated method stub
		g2d.drawImage(characterchosen.getImg().getImage(), characterchosen.getX(), characterchosen.getY(),characterchosen.getW(),characterchosen.getH(), this);
	}



	private void background(Graphics g2d) {
		// TODO Auto-generated method stub
		g2d.drawImage(mazebg1.getImage(),mazex, mazey, mapWidth, mapHeight, this);
	}



	private void start(Graphics g2d) {
		// TODO Auto-generated method stub
		String start= "start";
		g2d.drawImage(junglebg.getImage(), 0,0, getSize().width, getSize().height, this);
		g2d.setColor(Color.green);
		g2d.fillRoundRect(700,800,400,100, 30, 30);
		
		if(characterchosen!= null&&gameplay==false) {
			Typestr++;
			if(Typestr>start.length()) {
				Typestr =start.length();
			}
			g2d.setColor(Color.white);
			g2d.setFont(new Font("Broadway", Font.BOLD, 70));
			g2d.drawString(start.substring(0, Typestr), 800, 875);
			
		}
		
		for(Character w: Wizards) {
			if(w.gethovering()==true) {
				w.skilldisplay(g2d);
				w.drawhoverRect(g2d);
				
			}
			if(w.selection()==true) {
				w.skilldisplay(g2d);
				w.selectstring(g2d);
			
			}
			
			w.drawChar(g2d);
			
			//System.out.println(w);
			
		}
		 
	
	}


private void drawenemies(Graphics g2d) {
	enemies.element().drawChar(g2d);

	
	eattack(g2d);
	}


	public void eattack(Graphics g2d) {
	
		if((System.currentTimeMillis()-currentime)%200==0) {
			currentime= System.currentTimeMillis();
			et.add(new Range(enemies.element().getX(), enemies.element().getY(), 2,2, a.getName(), a.getDamage(), a.getHealth(), a.getLevel(), a.getImg()));
			draweattack(g2d);
			System.out.println("working");
		}
	
	
	
	}

	public void draweattack(Graphics g2d){
		for(Range e: et){
			g2d.drawImage(e.getImg().getImage(), e.getX(), e.getY(), 200, 200, this);
			e.Horz();
			if(e.getX()>1800){
				et.remove(e);
			}
		}
	
	}
public int mazex(int maze) {
	mazex+=maze;
	return mazex;
	
}
public int mazey(int mazze) {
	mazey+=mazze;
	return mazey;
}
	@Override
public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void keyPressed(KeyEvent e) {

		// TODO Auto-generated method stub
		int key;
		key= e.getKeyCode();
		
		
		//w
		if(key==87&&starter==false) {
			characterchosen.setY(-5);
		if(characterchosen.getY()<=0){
			mazey(+31);	
		
			}

		}
		//s
		 if(key==83&&starter==false) {
			//characterchosen.setY(+5);
			mazey(-31);
		}
		//a
		 if(key==65&&starter==false) {
			//characterchosen.setX(-5);
			mazex(+31);
		}
		//d
		 if(key==68 && starter==false) {
			characterchosen.setX(+5);
		 
		if(key==68 && starter==false&&characterchosen.getX()+100>mazebg1.getIconWidth()){
			mazex(-31);	
			}
		
		 }
		//wa
		
		//wd


		///sa


		///sd











		//w stsrt button
		if(starter==true&&key==87&&characterchosen!=null) {
			starter=false;
			gameplay=true;
		}
		//i
		if(key==73&&characterchosen!=null) {
		abilityChooser(0);
	}
		
		//j
		if(key==74&&characterchosen!=null) {
		abilityChooser(1);
		
	}

		//k
		if(key==75&&characterchosen!=null) {
		abilityChooser(2);
		}
	
		//L
		if(key==76&&characterchosen!=null) {
		abilityChooser(3);
		
	}

}
	


	public void abilityChooser(int index){
				if(characterchosen.getAbility().get(index) instanceof Range){
				a= characterchosen.getAbility().get(index);
				//System.out.println("x"+characterchosen.getX());
				shoot.add(new Range(characterchosen.getX()+100, characterchosen.getY()+100, 2,2, a.getName(), a.getDamage(), a.getHealth(), a.getLevel(), a.getImg()));
				//drawwep = true;
					//System.out.println(shoot);
						
			}
			else{
					if(characterchosen.getAbility().get(index) instanceof Melee){
				ability.add(characterchosen.getAbility().get(index));
				Weapon m=characterchosen.getAbility().get(index);

				//checking what type it is
					if(characterchosen.getAbility().get(index) instanceof MeditationMelee){
			hit.add(new MeditationMelee(characterchosen.getX(),characterchosen.getY()));

					} 
				else if(characterchosen.getAbility().get(index) instanceof JewJab){
			hit.add(new JewJab(characterchosen.getX(),characterchosen.getY()));
			
					}
				else if(characterchosen.getAbility().get(index) instanceof ChallahCharge){
			hit.add(new ChallahCharge(characterchosen.getX(),characterchosen.getY()));

						}
				else if(characterchosen.getAbility().get(index) instanceof RightCross){
			hit.add(new RightCross(characterchosen.getX(),characterchosen.getY()));
				}
					else if(characterchosen.getAbility().get(index) instanceof Crucifiction){
			hit.add(new Crucifiction(characterchosen.getX(),characterchosen.getY()));
						}
				else if(characterchosen.getAbility().get(index) instanceof ShankShallom){
			hit.add(new ShankShallom(characterchosen.getX(),characterchosen.getY()));
				}
					else if(characterchosen.getAbility().get(index) instanceof HijabHit){
			hit.add(new HijabHit(characterchosen.getX(),characterchosen.getY()));
					}

				 timeatpoint=System.currentTimeMillis()/1000;
			
			}
			else{
				if(characterchosen.getAbility().get(index) instanceof Healing){
				ability.add(characterchosen.getAbility().get(index));
				Weapon h = characterchosen.getAbility().get(index);
			}
			else{
				if(characterchosen.getAbility().get(index) instanceof Daze){
				ability.add(characterchosen.getAbility().get(index));
				Weapon d= characterchosen.getAbility().get(index);
			}
			}
		}
	}
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x= e.getX();
		int y= e.getY();
		for(Character sl: Wizards) {
			if(sl.hover(x, y)){
				sl.ishovering=true;
			} else {
				sl.ishovering=false;
			}
		}
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x= e.getX();
		int y= e.getY();
		
		for(Character sel: Wizards ) {
			if(sel.hover(x, y)&& charselction==true) {
				sel.selected=true;
				characterchosen= sel;
			//	System.out.println(characterchosen);
			}else{
				sel.selected=false;
			}
		if(sel.selected==true) {
		sel.drawhoverRect(getGraphics());
			}
		}
		
		if(x>700&&x<700+400&&y>800&&y<900) {
			gameplay=true;
			charselction=false;
		}
		}




	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}