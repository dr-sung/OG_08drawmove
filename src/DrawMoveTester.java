
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawMoveTester extends JFrame {

    private CanvasPanel canvas;
    private JButton upButton;
    private JButton downButton;
    private JButton leftButton;
    private JButton rightButton;

    public void initialize() {

        canvas = new CanvasPanel();
        JPanel buttonPanel = new JPanel();

        ActionListener listener = new DirectionListener();

        upButton = new JButton("Up");
        upButton.addActionListener(listener);

        downButton = new JButton("Down");
        downButton.addActionListener(listener);

        leftButton = new JButton("Left");
        leftButton.addActionListener(listener);

        rightButton = new JButton("Right");
        rightButton.addActionListener(listener);

        // add components to content pane

        Container contentPane = getContentPane();
        contentPane.add(canvas, "Center");

        buttonPanel.add(upButton);
        buttonPanel.add(downButton);
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);

        contentPane.add(buttonPanel, "South");
    }

    // inner class definition
    private class DirectionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            Object source = event.getSource();

            if (source == upButton) {
                canvas.moveRectangle(0, -1);
            } else if (source == downButton) {
                canvas.moveRectangle(0, 1);
            } else if (source == leftButton) {
                canvas.moveRectangle(-1, 0);
            } else if (source == rightButton) {
                canvas.moveRectangle(1, 0);
            }
        }
    }
}