import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class frameSlaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(640, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		
		JLabel label = new JLabel("Enter here", SwingConstants.CENTER);
		
		frame.add(label);
		frame.addKeyListener(new kbListener());
		// frame.pack();
	}

}
