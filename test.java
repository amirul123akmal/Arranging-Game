import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		JLabel labelling = new JLabel("Click here and start typing", 
				SwingConstants.CENTER);
		
		JFrame frame = new JFrame();
		frame.add(labelling);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(new kb());
		
		frame.setSize(640, 480);
		frame.setVisible(true);
	}

}

class kb extends KeyAdapter
{
	String a = "";
	public void keyPressed(KeyEvent event)
	{
		char ch = event.getKeyChar();
		a += ch;
		System.out.println(a);
	}
}
