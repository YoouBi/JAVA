import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame {
	private int number = 0; // JFrame이 아닌 나만의 특징
	private int numberDown = 0;
	
	public MyCounter() {
		super("카운터");
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0");
		JButton btn = new JButton("증가");
		pnl.setBackground(Color.GRAY);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number++;
				lbl.setText(String.valueOf(number));
			}
		});
		
		JButton btn2 = new JButton("감소");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number--;
				lbl.setText(String.valueOf(number));
			}
		});
		
		// 열번 누르면 색깔 바뀌게
		JButton btn3 = new JButton("10클릭 색변환");
		btn3.addActionListener(new ActionListener() {
			int count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count == 10) {
					pnl.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		
		pnl.add(lbl);
		pnl.add(btn);
		pnl.add(btn2);
		pnl.add(btn3);
		
//		JPanel pnl = new JPanel();
//		JLabel lbl = new JLabel("0");
//		JLabel lblR = new JLabel("0");
//		JButton btn = new JButton("왼쪽 증가/오른쪽 감소");
//		btn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
////				System.out.println("왼쪽 레이블 숫자 바꿀 예정");
//				number++;
//				numberDown--;
//				lbl.setText(String.valueOf(number)); // JLabel은 int값을 안받아서 String으로 변환해준것
////				lbl.setText("글자 바꾸기~");
//				lblR.setText(String.valueOf(numberDown));
//			}
//		});
//		
//		pnl.add(lbl);
//		pnl.add(btn);
//		pnl.add(lblR);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyCounter().setVisible(true);
	}
}
