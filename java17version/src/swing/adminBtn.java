package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class adminBtn extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminBtn frame = new adminBtn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public adminBtn() {		// 메인 창
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Downloads\\KakaoTalk_20240412_143626036.png"));
		setTitle("직원 확인");
		setFont(new Font("경기천년바탕 Bold", Font.BOLD, 12));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 안내 문구
		JLabel lblNewLabel = new JLabel("직원코드와 이름을 입력하세요.");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("경기천년제목V Bold", Font.BOLD, 12));
		lblNewLabel.setBounds(143, 40, 177, 31);
		contentPane.add(lblNewLabel);
		
		// 직원코드 입력 창
		JLabel lblNewLabel_1 = new JLabel("직원코드");
		lblNewLabel_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_1.setFont(new Font("경기천년제목V Bold", Font.BOLD, 12));
		lblNewLabel_1.setBounds(113, 78, 53, 31);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(178, 83, 142, 21);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(178, 124, 142, 21);
		contentPane.add(textField_1);
		
		// 이름 입력 창
		JLabel lblNewLabel_1_1 = new JLabel("이름");
		lblNewLabel_1_1.setForeground(SystemColor.activeCaption);
		lblNewLabel_1_1.setFont(new Font("경기천년제목V Bold", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(113, 119, 53, 31);
		contentPane.add(lblNewLabel_1_1);
		
		// 확인 후 접속하기
		JButton btnNewButton = new JButton("확 인");
		btnNewButton.setForeground(SystemColor.textInactiveText);
		btnNewButton.setFont(new Font("경기천년제목V Bold", Font.BOLD, 12));
		btnNewButton.setBackground(SystemColor.window);
		btnNewButton.setBounds(178, 186, 97, 23);
		contentPane.add(btnNewButton);
		
		// 확인 버튼 클릭
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminWindow1 adminWindow = new adminWindow1();
		        adminWindow.setVisible(true);
		        
			}
		});
	}
}
