import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.Font;

// 사용자가 메뉴를 선택하면 가격이 나오는 프로그램?
// 수량까지
// 전체 선택/전체 취소
public class Main2 extends JFrame {
	private int priceSum;
	private String sum = String.valueOf(priceSum);
	private JLabel allPrice;

	public Main2() {
		priceSum = 0;
		sum = "Price";
		
		JLabel count = new JLabel(); 
		allPrice = new JLabel();
		
		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		JPanel pnl3 = new JPanel();
		JPanel pnl4 = new JPanel();
		JPanel pnlTop = new JPanel();
		
		pnl4.setPreferredSize(new Dimension(250, 100));
//		pnl4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		pnl4.setBackground(Color.WHITE);
		
		JPanel pnlBox = new JPanel();
		JPanel pnlwidth = new JPanel();
		JPanel pnlHeight = new JPanel();
		
		JButton selectAll = new JButton("전체 선택");
		JButton notAll = new JButton("전체 취소");
		JButton plus1 = new JButton("+");
		plus1.setFont(new Font("Consolas", Font.BOLD, 9));
		plus1.setPreferredSize(new Dimension(20, 20));
		JButton minus1 = new JButton("-");
		JButton plus2 = new JButton("+");
		JButton minus2 = new JButton("-");
		JButton plus3 = new JButton("+");
		JButton minus3 = new JButton("-");
		
		BorderLayout border = new BorderLayout();
		pnlHeight.setLayout(border);
		
		BoxLayout bigBox = new BoxLayout(pnlwidth, BoxLayout.X_AXIS);
		pnlBox.setLayout(bigBox);
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		
		
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
		pnl1.setLayout(flow);
		
		FlowLayout flow2 = new FlowLayout(FlowLayout.LEFT);
		pnl2.setLayout(flow2);
		
		FlowLayout flow3 = new FlowLayout(FlowLayout.LEFT);
		pnl3.setLayout(flow3);
		
		JCheckBox check1 = new JCheckBox("짜장면\t: 5000원");
		JCheckBox check2 = new JCheckBox("짬뽕\t: 5500원");
		JCheckBox check3 = new JCheckBox("탕수육\t: 12000원");
		
		selectAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				check1.setSelected(true);
				check2.setSelected(true);
				check3.setSelected(true);
			}
		});
		
		notAll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				check1.setSelected(false);
				check2.setSelected(false);
				check3.setSelected(false);
			}
		});
		
		check1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {	
				if(check1.isSelected()) priceSum += 5000;
				else priceSum -= 5000;
				sum = String.valueOf(priceSum);
				allPrice.setText(sum);
			}
		});
		
		check2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {	
				if(check2.isSelected()) priceSum += 5500;
				else priceSum -= 5500;
				sum = String.valueOf(priceSum);
				allPrice.setText(sum);
			}
		});
		
		check3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {	
				if(check3.isSelected()) priceSum += 12000;
				else priceSum -= 12000;
				sum = String.valueOf(priceSum);
				allPrice.setText(sum);
			}
		});

		pnlTop.add(selectAll);
		pnlTop.add(notAll);
		
		pnl1.add(check1);
		pnl1.add(plus1);
		pnl1.add(minus1);
		pnl2.add(check2);
		pnl2.add(plus2);
		pnl2.add(minus2);
		pnl3.add(check3);
		pnl3.add(plus3);
		pnl3.add(minus3);
		pnl4.add(allPrice);
		
		pnlBox.add(pnl1);
		pnlBox.add(pnl2);
		pnlBox.add(pnl3);
		pnlwidth.add(pnlBox);
		pnlwidth.add(pnl4);
		
		pnlHeight.add(pnlTop, BorderLayout.CENTER);
		pnlHeight.add(pnlwidth, BorderLayout.SOUTH);

		getContentPane().add(pnlHeight);

		setSize(550, 190); // 와! border에서 동서남북의 크기는 지정되어있어도 센터는 전체 크기에서 동서남북의 사이즈에 맞춰서 넓어지려고 함!
//		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Main2T().setVisible(true);
	} // 영빈아 ♥사랑♥ 해 담시간에 양치하러 가쟈
}
