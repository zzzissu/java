package project1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test1 extends JFrame {
	public void LogIn() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID: ");
		JLabel pw = new JLabel("PW: ");
		JTextField txt = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		panel.add(label);
		panel.add(txt);
		panel.add(pw);
		panel.add(txtPass);
		
		add(panel);
		
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.LogIn();
	}

}
