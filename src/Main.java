import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Main extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Main() {
        initUI();
    }

    private void initUI() {

        final Surface surface = new Surface();
        add(surface);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Timer timer = surface.getTimer();
                timer.stop();
            }
        });

        setTitle("Points");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                Main ex = new Main();
                ex.setVisible(true);
            }
        });
    }
}
