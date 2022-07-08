import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;

public class Main5 extends JFrame {
	public Main5() {
		JPanel pnl = new JPanel();
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image wantFood = kit.getImage("free-icon-hot-dog-4392717.png");
		Image image = kit.getImage("free-icon-fancy-1808101.png");
		
		JLabel food = new JLabel(new ImageIcon(wantFood));
		JLabel lbl = new JLabel(new ImageIcon(image)); // JLabel 텍스트뿐만 아니라 이미지도 표현 가능
		pnl.setPreferredSize(new Dimension(100, 100));
		pnl.add(food);
		pnl.add(lbl);
		
		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(box);

		getContentPane().add(pnl);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		new Main5().setVisible(true);
	}
}
