package game;

// ? Imports
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;

public class GamePanel extends JPanel implements Runnable {
    // ^ Generate a number between 0 and 6
    int randomNumber = (int) (Math.random() * 7);

    final int originalTileSize = 16;
    int scale = 3; // Can be modified by the user

    int tileSize = originalTileSize * scale;

    int maxScreenCol = 16;
    int maxScreenRow = 12;

    int screenWidth = maxScreenCol * tileSize;
    int screenHeight = maxScreenRow * tileSize;

    Thread gameThread;

    public GamePanel() {
        // ! Set the size of the panel
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setDoubleBuffered(true);

        // ! Set the background color of the panel
        this.setBackground(Color.BLACK);
    }

    public void start() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void run() {

    }
}
