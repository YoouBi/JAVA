import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main3 extends JFrame {
	public Main3() {
		JPanel pnl = new JPanel(null);
		pnl.setPreferredSize(new Dimension(500, 500));
		
		JButton btn = new JButton("Click Me");
		btn.setBounds(150, 150, 100, 100);
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setLocation((int) (Math.random() * 400), (int) (Math.random() * 400));
			}
		});
		
		pnl.add(btn);
		add(pnl);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}
}
