
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class CanvasPanel extends JPanel {

    public CanvasPanel() {
        rect = new Rectangle2D.Float(0, 0, RECT_WIDTH, RECT_HEIGHT);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.blue);
        g2.fill(rect);
    }

    /**
     * Moves the rectangle and repaints it. The rectangle is moved by multiples
     * of its full width or height.
     *
     * @param dx the number of width units
     * @param dy the number of height units
     */
    public void moveRectangle(int dx, int dy) {
        rect.setRect(
                rect.getX() + dx * RECT_WIDTH,
                rect.getY() + dy * RECT_HEIGHT,
                RECT_WIDTH, RECT_HEIGHT);
        repaint(); // request the invisible painter to redraw the canvas
    }
    
    private final Rectangle2D.Float rect;
    private static final int RECT_WIDTH = 20;
    private static final int RECT_HEIGHT = 30;
}
