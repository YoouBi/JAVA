import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener {
	private JButton btnEnable;
	private JButton btnDisable;
	private List<JButton> list;
	
	public Main4() {
		super("버튼 활성화 테스트~");
		list = new ArrayList<>();
		
		JPanel pnl = new JPanel();
		btnEnable = new JButton("활성화"); // Ctrl + 1을 누르면퀵픽스라는 메뉴가 뜨는데 바로 지역변수를 필드로 만드는 게 있다
		btnDisable = new JButton("비활성화");
		JButton btnNotShown = new JButton("보이니?");

//		btnDisable.setEnabled(false); // 컴포넌트들은 이런 활성화 비활성화 설정이 있는데
		btnNotShown.setVisible(false); // 보이는거에 대한 설정은 Visible로 없어지면
		// JPanel에 레이아웃 매니저가 있는데 component의 위치를 조정한다
		
		// 우측에 1~5의 버튼이 있는데 활성화 버튼을 누르면 전부 다 활성화되고, 비활성화 버튼을 누르면 전부 다 비활성화 되도록	
		btnEnable.addActionListener(this);
		btnDisable.addActionListener(this);
		
		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);
		for (int i = 0; i < 5; i++) {
			JButton btn = new JButton(String.valueOf(i));
			pnl.add(btn);
			
			list.add(btn);
		}
		
		add(pnl);
		
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnEnable) {
			for (JButton btn : list) {
				btn.setEnabled(true);
			}
		} else if(e.getSource() == btnDisable) {
			for (JButton btn : list) {
				btn.setEnabled(false);
			}
		}
	}
}