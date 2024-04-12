import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class adimMain extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtEmployeeCode;
    private JTextField txtEmployeeName;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	adimMain frame = new adimMain();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public adimMain() {
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
        JLabel lblInstruction = new JLabel("직원코드와 이름을 입력하세요.");
        lblInstruction.setForeground(SystemColor.activeCaption);
        lblInstruction.setFont(new Font("경기천년제목V Bold", Font.BOLD, 12));
        lblInstruction.setBounds(143, 40, 177, 31);
        contentPane.add(lblInstruction);

        // 직원코드 입력 창
        JLabel lblEmployeeCode = new JLabel("직원코드");
        lblEmployeeCode.setForeground(SystemColor.activeCaption);
        lblEmployeeCode.setFont(new Font("경기천년제목V Bold", Font.BOLD, 12));
        lblEmployeeCode.setBounds(113, 78, 53, 31);
        contentPane.add(lblEmployeeCode);

        txtEmployeeCode = new JTextField();
        txtEmployeeCode.setColumns(10);
        txtEmployeeCode.setBounds(178, 83, 142, 21);
        contentPane.add(txtEmployeeCode);

        txtEmployeeName = new JTextField();
        txtEmployeeName.setColumns(10);
        txtEmployeeName.setBounds(178, 124, 142, 21);
        contentPane.add(txtEmployeeName);

        // 이름 입력 창
        JLabel lblEmployeeName = new JLabel("이름");
        lblEmployeeName.setForeground(SystemColor.activeCaption);
        lblEmployeeName.setFont(new Font("경기천년제목V Bold", Font.BOLD, 12));
        lblEmployeeName.setBounds(113, 119, 53, 31);
        contentPane.add(lblEmployeeName);

        // 확인 버튼
        JButton btnConfirm = new JButton("확 인");
        btnConfirm.setForeground(SystemColor.textInactiveText);
        btnConfirm.setFont(new Font("경기천년제목V Bold", Font.BOLD, 12));
        btnConfirm.setBackground(SystemColor.window);
        btnConfirm.setBounds(178, 186, 97, 23);
        contentPane.add(btnConfirm);

        // 확인 버튼 클릭
        btnConfirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openAdminWindow();
            }
        });
    }

    // 확인 버튼 클릭 시 관리자 창 열기
    private void openAdminWindow() {
        adminWindow1 adminWindow = new adminWindow1();
        adminWindow.setVisible(true);
    }
}