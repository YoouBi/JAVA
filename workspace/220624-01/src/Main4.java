import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Main4 extends JFrame {
	private JLabel result;
	private JRadioButton rdbCInch;
	private JRadioButton rdbICm;
	private double text;

	public Main4() {
		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		JPanel pnlBox = new JPanel();
		
		JButton Change = new JButton("변환");
		rdbCInch = new JRadioButton("cm → inch");
		rdbICm = new JRadioButton("inch → cm");
		ButtonGroup group = new ButtonGroup();
		group.add(rdbCInch);
		group.add(rdbICm);
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		
		JTextField input = new JTextField(5);
		
		result = new JLabel("결과");
		
		Change.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text = Integer.valueOf(input.getText());
				if(rdbCInch.isSelected()) {
					result.setText("cm → " + text * 2.54  + " inch");
				} else {
					result.setText("inch → " + text * 39.37 + " cm");
				}
				System.out.println("작동?");
			}
		});
		
		pnl1.add(rdbCInch);
		pnl1.add(rdbICm);
		pnl1.add(Change);
		pnl2.add(input);
		pnl2.add(result);
		pnlBox.add(pnl1);
		pnlBox.add(pnl2);
		
		add(pnlBox);
		
		setSize(400, 110);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
