import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
	public Main4() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		// 파일을 임포트할때, 자원 즉 리소스 파일이 같은 파일 내에 없으면(자바 패키지가 없는 곳에 실행 파일을 생성하면) 리소스를 찾을 수 없어서 프로그램에 자원이 나타나지 않는다
		// 그래서 클래스 파일 안에 자원까지 함께 넣어서 emport하도록하려면
		// 아예 src 파일 안에 그림 파일을 넣고
		URL url = Main4.class.getClassLoader().getResource("images/춘식11.png"); // 처럼 리소스를 찾을 수 있게끔 경로 지정을 해준다
		// .getClassLoader()는 클래스 안에서 자원을 찾고, .getResource는 URL(자원의 위치를 나타내는 약자로써 하나의 형식)이고
		// 자바에서는 URL를 하나의 객체로써 명시
		ImageIcon image = new ImageIcon(kit.getImage(url));
		URL url2 = Main4.class.getClassLoader().getResource("images/춘식16.png");
		// images라는 파일을 생성해서 그 안에 그림파일들을 넣으면 컴파일 할 때는 괜찮지만 실행할 때 경로를 못찾는다
		// 따라서 images/라고 파일 경로를 한번 더 써넣어줘서 경로 지정을 해줘야한다
		ImageIcon image2 = new ImageIcon(kit.getImage(url2));
		// 패키지 안에 있는 src와 resource 폴더들은 emport 할 때 같은 폴더 안에 같은 경로로 들어간다
		// 특별히 지정하지 않으면 똑같은 아웃폴더(bin) 안으로 들어간다
		
//		Image image = kit.getImage("춘식16.png");
//		Image image2 = kit.getImage("춘식11.png");
		
//		JLabel lbl = new JLabel(new ImageIcon(image)); // JLabel 텍스트뿐만 아니라 이미지도 표현 가능
		JLabel lbl = new JLabel(image); // JLabel 텍스트뿐만 아니라 이미지도 표현 가능
		pnl.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(image2);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lbl.setIcon(image);
			}
		});
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
