import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

public class memo extends JFrame {
	public memo() {
		JFileChooser chooser = new JFileChooser();
		
		JPanel pnl = new JPanel();
		JButton openBtn = new JButton("열기");
		JButton closeBtn = new JButton("저장");
		JTextArea textArea = new JTextArea("");
		JScrollPane scrl = new JScrollPane(textArea);
		scrl.setPreferredSize(new Dimension(450, 320));

		FileFilter filter = new FileFilter() {
			@Override
			public String getDescription() {
				return "텍스트 파일";
			}

			@Override
			public boolean accept(File f) {
				if (f.isDirectory()) {
					return true;
				}
				return f.getName().endsWith(".txt");
			}
		};
		chooser.setFileFilter(filter);

		openBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = chooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					BufferedReader br = null;

					try {
						br = new BufferedReader(new FileReader(file));

						String line;

						textArea.setText(null);
						;
						while ((line = br.readLine()) != null) {
							textArea.append(line);
							textArea.append("\n");
						}
					} catch (FileNotFoundException f) {
						f.printStackTrace();
					} catch (IOException i) {
						i.printStackTrace();
					} finally {
						if (br != null) {
							try {
								br.close();
							} catch (IOException i) {
								i.printStackTrace();
							}
						}
					}
				}
			}
		});

		closeBtn.addActionListener(new ActionListener() {
			private File file;

			public File getFile() {
				return file;
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				int result = chooser.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					file = chooser.getSelectedFile();
					PrintWriter pw = null;

					try {
						pw = new PrintWriter(new FileWriter(file));

						pw.println(textArea.getText());
						pw.flush();
					} catch (IOException i) {
						i.printStackTrace();
					} finally {
						if (pw != null) {
							pw.close();
						}
					}
				}
			}
		});

		pnl.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();

				if (code == KeyEvent.CTRL_DOWN_MASK && code == KeyEvent.VK_S && getFile().exists()) {
//					chooser.APPROVE_OPTION
				}
			}
		});

		pnl.add(openBtn);
		pnl.add(closeBtn);
		pnl.add(scrl);

		add(pnl);

		setSize(500, 400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		;
	}

	protected File getFile() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		new memo().setVisible(true);
	}
}
