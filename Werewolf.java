import javax.swing.ImageIcon;

public class Werewolf extends Enemies{
    public Werewolf(int x, int y,int hp, int da, int level) {
        super(x,y,200,200,new ImageIcon("Werewolf.gif"),2,2,hp,da, level);
    }
}
