import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;


public class Two {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->showGUI());
	}

	private static void showGUI() {
		JFrame frame= new JFrame("Demo1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(700, 700));
		JMenuBar menuBar= new JMenuBar();
		menuBar.setOpaque(true);
		menuBar.setBackground(new Color(154, 165, 127));
		menuBar.setPreferredSize(new Dimension(200, 20));
		frame.setJMenuBar(menuBar);
		//Here panel is JComponent object and getLayout() returns FlowLayout
		JPanel panel= new JPanel();
		panel.setToolTipText("Hello There!");
		frame.setContentPane(panel);
		//Here panel has flowLayout but frame has BorderLayout.
		JLabel label= new JLabel(frame.getLayout().getClass().toString());
		label.setBorder(BorderFactory.createMatteBorder(20, 20, 40, 20, Color.BLACK));
		frame.add(label, BorderLayout.CENTER);
		frame.pack();
		
		frame.setVisible(true);
	}

}
