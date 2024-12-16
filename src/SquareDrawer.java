import javax.swing.*;
import java.awt.*;

public class SquareDrawer extends JFrame {

    private int squareSize = 50; // Default square size
    private int squareX = 100;  // Initial x-coordinate
    private int squareY = 100;  // Initial y-coordinate

    public SquareDrawer() {
        setTitle("Square Drawer");
        setSize(400, 400); // Window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        // Add interactivity with the keyboard
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
                switch (e.getKeyCode()) {
                    case java.awt.event.KeyEvent.VK_UP:
                        squareY = Math.max(0, squareY - 10); // Move up
                        break;
                    case java.awt.event.KeyEvent.VK_DOWN:
                        squareY = Math.min(getHeight() - squareSize, squareY + 10); // Move down
                        break;
                    case java.awt.event.KeyEvent.VK_LEFT:
                        squareX = Math.max(0, squareX - 10); // Move left
                        break;
                    case java.awt.event.KeyEvent.VK_RIGHT:
                        squareX = Math.min(getWidth() - squareSize, squareX + 10); // Move right
                        break;
                    case java.awt.event.KeyEvent.VK_PLUS:
                    case java.awt.event.KeyEvent.VK_EQUALS: // "+" key
                        squareSize = Math.min(getWidth(), squareSize + 10); // Increase size
                        break;
                    case java.awt.event.KeyEvent.VK_MINUS:
                        squareSize = Math.max(10, squareSize - 10); // Decrease size
                        break;
                }
                repaint(); // Redraw the square
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE); // Square color
        g.fillRect(squareX, squareY, squareSize, squareSize);
    }

    public static void main(String[] args) {
        new SquareDrawer();
    }
}