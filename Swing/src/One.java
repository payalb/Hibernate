import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class One {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(()->showGUI());

	}

	private static void showGUI() {
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(750,750);
		//Here getContentPane() returns Container object and getLayout() returns BorderLayout
		frame.getContentPane().add(new JLabel(frame.getLayout().getClass().toString()));
		frame.pack();
		frame.setVisible(true);
	}

}
