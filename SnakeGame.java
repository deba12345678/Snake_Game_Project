
package snakegame;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class SnakeGame extends JFrame{
    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack();
        //setLocation(700, 300);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new SnakeGame().setVisible(true);

    }
    
}
