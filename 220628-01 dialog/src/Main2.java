import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class ExitDialog extends JDialog {
	private boolean exit;
	
	public ExitDialog(JFrame owner) {
		super(owner, "종료하시겠습니까?", true);
		
		JPanel pnl = new JPanel();
		JButton btnYes = new JButton("종료");
		JButton btnNo = new JButton("취소");
		
		ActionListener actionListener = new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				exit = (e.getSource() == btnYes);
				dispose(); // 버튼 누르면 창이 닫혀야하니까
			}
		};
		
		btnYes.addActionListener(actionListener);
		btnNo.addActionListener(actionListener);
		
		pnl.add(btnYes);
		pnl.add(btnNo);
		
		add(pnl);
		setSize(250, 250);
	}
	
	public boolean showDialog() {
		setVisible(true);
		
		return exit;
	}
}

public class Main2 extends JFrame{
	public Main2() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { // 닫으려고 할 때
//				ExitDialog dialog = new ExitDialog(Main2.this);
////				dialog.setVisible(true);
//				boolean result = dialog.showDialog();
				
				// 간단하게 물어볼때는 JOptionPane, 좀 더 복잡하게 물어볼 때는 JDialog
//				JOptionPane.showConfirmDialog(Main2.this, "확인창"); // Modal 적용되어있음
				// 예, 아니로만 물어보고 싶으면 메소드 오버로드로 옵션이 있는데 밑의 메소드는 3번째로
				// 뭐였지...암튼 자기 자신, 텍스트, 타이틀, 옵션 상수를 전달받아서 인트 값으로 내보내준다
				int result = JOptionPane.showConfirmDialog(Main2.this
						, "종료하시겠습니까?", "종료 확인", JOptionPane.YES_NO_OPTION);
//				JOptionPane.showInputDialog(Main2.this, "입력창");
				
				if (result == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
//				if (result) {
//					setDefaultCloseOperation(EXIT_ON_CLOSE);
//				}
			}
			// windowOpened(WindowEvent e) { // 창이 열렸을 때, 새 창 활성화
			// windowIconified(WindowEvent e) { // 최소화(창 내림)로 갔을 때
			// windowDeiconified(WindowEvent e) { // 최소화에서 벗어났을 때
			// windowDeactivated(WindowEvent e) { // 비활성화
			// windowClosed(WindowEvent e) { // 닫혔을 때
			// windowActivated(WindowEvent e) { // 활성화
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // 닫기 버튼을 눌렀을 때 아무 일도 안일어남
	}
	
	public static void main(String[] args) {
		new Main2().setVisible(true);
	}
}
