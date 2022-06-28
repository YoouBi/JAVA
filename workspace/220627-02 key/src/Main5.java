import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main5 extends JFrame {
	public Main5() {
		HashMap map = new HashMap<>();
		map.put("YoouBi", "yoyobiii");
//		User user1 = new User("YoouBi", "yoyobiii");

		CardLayout layout = new CardLayout();

		JPanel pnlId = new JPanel();
		JPanel pnlPw = new JPanel();
		JPanel pnlIP = new JPanel();

		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		JPanel pnl3 = new JPanel();
		JPanel pnlCreate = new JPanel();

		JLabel stringId = new JLabel("아이디 :");
		JLabel stringPw = new JLabel("비밀번호 :");
		JLabel stringPw2 = new JLabel("비밀번호 확인 :");

		JTextField id = new JTextField(10);
		JTextField idCreate = new JTextField(15);
		JPasswordField pw = new JPasswordField(10);
		JPasswordField pwCreate = new JPasswordField(15);
		JPasswordField pwCreate2 = new JPasswordField(15);

		JButton signIn = new JButton("로그인");
		JButton create = new JButton("회원가입");
//		JButton check = new JButton("중복 확인");
		JButton createPage = new JButton("회원가입");

		BoxLayout box = new BoxLayout(pnlIP, BoxLayout.Y_AXIS);
		pnlIP.setLayout(box);
		BoxLayout box2 = new BoxLayout(pnlCreate, BoxLayout.Y_AXIS);
		pnlCreate.setLayout(box2);

		signIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pw.getText().equals(map.get(id.getText()))) {
					JOptionPane.showMessageDialog(Main5.this, "로그인 되었습니다.");
				} else {
					JOptionPane.showMessageDialog(Main5.this, "일치하는 회원정보가 없습니다!");
				}
			}
		});

		create.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				layout.show(pnlAll, "B");
				JDialog dialog = new JDialog();
				dialog.add(pnlCreate);
				dialog.setVisible(true);
				dialog.setSize(400, 180);
			}
		});

		createPage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = idCreate.getText();
				String pw = pwCreate.getText();
				String pw2 = pwCreate2.getText();
				
				boolean twin = pw.equals(pw2);
				boolean iplength = 4 > id.length() || id.length() > 12
						|| 4 > pw.length() || pw.length() > 12;

				if (map.containsKey(id)) {
					JOptionPane.showMessageDialog(Main5.this, "같은 아이디가 있습니다!");
				} else if (iplength) {
					JOptionPane.showMessageDialog(Main5.this, "아이디와 비밀번호의 길이는 4~12자 사이로 입력해야 합니다.");
				} else if (!twin) { // 주말에 폰트 색 변환 + 옆에 띄우는걸로 바꿔보기
					JOptionPane.showMessageDialog(Main5.this, "비밀번호가 일치하지 않습니다.");
				} else {
					JOptionPane.showMessageDialog(Main5.this, "회원가입 되었습니다.");
					map.put(id, pw);
				}
			}
		});

		pnlId.add(id);
		pnlId.add(signIn);
		pnlPw.add(pw);
		pnlPw.add(create);
		pnlIP.add(pnlId);
		pnlIP.add(pnlPw);

		pnl1.add(stringId);
		pnl1.add(idCreate);
//		pnl1.add(check);
		pnl2.add(stringPw);
		pnl2.add(pwCreate);
		pnl3.add(stringPw2);
		pnl3.add(pwCreate2);
		pnlCreate.add(pnl1);
		pnlCreate.add(pnl2);
		pnlCreate.add(pnl3);
		pnlCreate.add(createPage);

//		pnlAll.add(pnlCreate, "B");	
		// 객체의 유효성(깨지지 않고 그림을 하나하나 그리기 위해서)이 있어야해서 그걸 예방하는 차원에서
		// 같은 참조의 컴포넌트를 쓰면 A에 있던걸 B에 뚝 떼어써서 같이 쓰면 안되게 만들어놨다

		add(pnlIP);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 120);
	}

	public static void main(String[] args) {
		new Main5().setVisible(true);
	}
}