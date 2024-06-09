package open_Multi_Form;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Form1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 frame = new Form1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Dialog", Font.PLAIN, 12));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblForm = new JLabel("Form1");
		lblForm.setFont(new Font("DejaVu Serif", Font.BOLD, 24));
		lblForm.setBounds(184, 12, 105, 42);
		contentPane.add(lblForm);
		
		JButton btnGoToForm = new JButton("Go to Form2");
		btnGoToForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form2 f2 =new Form2();
				f2.setVisible(true);
				f2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		btnGoToForm.setBounds(45, 116, 150, 25);
		contentPane.add(btnGoToForm);
		
		JButton btnGoToForm_1 = new JButton("Go to Form3");
		btnGoToForm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form3 f3 = new Form3();
				f3.setVisible(true);
				f3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		btnGoToForm_1.setBounds(247, 116, 150, 25);
		contentPane.add(btnGoToForm_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(321, 226, 117, 25);
		contentPane.add(btnExit);
	}
}
