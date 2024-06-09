package birthDate_Calculate;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.InputMethodListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.InputMethodEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FrmBDate extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBDate frame = new FrmBDate();
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
	public FrmBDate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculateDateOf = new JLabel("Calculate Date of Birth");
		lblCalculateDateOf.setFont(new Font("DejaVu Serif", Font.BOLD, 20));
		lblCalculateDateOf.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent arg0) {
			}
			public void inputMethodTextChanged(InputMethodEvent arg0) {
			}
		});
		lblCalculateDateOf.setBounds(96, 12, 269, 27);
		contentPane.add(lblCalculateDateOf);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("DejaVu Serif", Font.BOLD, 12));
		lblDateOfBirth.setBounds(36, 76, 90, 15);
		contentPane.add(lblDateOfBirth);
		
		JDateChooser dcBDate = new JDateChooser();
		dcBDate.setBounds(167, 72, 188, 19);
		contentPane.add(dcBDate);
		
		JButton btnCalc = new JButton("Calculate");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
				int jearNow = Integer.parseInt(sdf.format(d));
				int jearBD = Integer.parseInt(sdf.format(dcBDate.getDate()));
				int BD = jearNow - jearBD;
				
				JOptionPane.showMessageDialog(null, "Your Date of Birth is: "+ BD);
			}
		});
		btnCalc.setFont(new Font("DejaVu Serif", Font.BOLD, 12));
		btnCalc.setBounds(196, 144, 117, 25);
		contentPane.add(btnCalc);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("DejaVu Serif", Font.BOLD, 12));
		btnExit.setBounds(348, 226, 90, 25);
		contentPane.add(btnExit);
	}
}
