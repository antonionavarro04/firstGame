package game;

// ? Imports
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // ! Game Panel Creation
        GamePanel gamePanel = new GamePanel();

        // ! Basic Window Creation
        JFrame window = new JFrame(Info.gameName + " " + Info.gameState + Info.gameVersion);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        // ! Window Size & BackgroundColor
        window.add(gamePanel);
        window.pack();

        // ! Window Visibility
        window.setVisible(true);
    }
}
