package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Button;
import java.awt.Choice;
import java.awt.List;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class adminWindow1 extends JFrame {
	
	public adminWindow1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Downloads\\KakaoTalk_20240412_143626036.png"));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setBackground(Color.WHITE);
		
		
        setTitle("member page");
        setSize(762, 380);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 현재 창만 닫히도록 설정

        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.window);

        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("직원코드와 이름을 입력하세요.");
        lblNewLabel.setBounds(264, 83, 173, 36);
        lblNewLabel.setForeground(SystemColor.activeCaption);
        lblNewLabel.setFont(new Font("경기천년제목V Bold", Font.BOLD, 12));
        panel.add(lblNewLabel);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBackground(Color.WHITE);
        comboBox.setForeground(SystemColor.activeCaption);
        comboBox.setFont(new Font("나눔고딕코딩", Font.BOLD, 12));
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"관리 목록", "현재 매출액", "재고 수량", "직원 관리"}));
        comboBox.setBounds(0, 0, 88, 26);
        panel.add(comboBox);
        setVisible(true);
    }

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminWindow1 frame = new adminWindow1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
