import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class TestBorder extends JFrame {
	public TestBorder() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new TestBorder().setVisible(true);
	}
}
