
import javax.swing.JFrame;

public class Main {

    public static final int DEFAULT_FRAME_WIDTH = 500;
    public static final int DEFAULT_FRAME_HEIGHT = 300;

    public static void main(String[] args) {

        DrawMoveTester frame = new DrawMoveTester();

        frame.setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);
        frame.setTitle("DrawMoveTester");

        frame.setLocation(100, 100);

        frame.initialize();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
