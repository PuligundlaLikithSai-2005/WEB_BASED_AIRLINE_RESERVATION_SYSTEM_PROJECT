import javax.swing.*;
import java.awt.*;

/**
 * NoteBackground
 *
 * The original README/source references an external image named
 * "note_bg.gif". The image itself was not embedded in the README,
 * so this Java class loads that image as an application resource.
 */
public class NoteBackground extends JPanel {

    private ImageIcon noteBackground;

    public NoteBackground() {
        noteBackground = new ImageIcon("note_bg.gif");
        setLayout(null);
        setPreferredSize(new Dimension(320, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (noteBackground.getImageLoadStatus() == MediaTracker.COMPLETE) {
            g.drawImage(
                noteBackground.getImage(),
                0, 0,
                getWidth(), getHeight(),
                this
            );
        }
    }

    public ImageIcon getNoteBackground() {
        return noteBackground;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Note Background");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NoteBackground panel = new NoteBackground();
        frame.add(panel);

        frame.setSize(340, 240);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
