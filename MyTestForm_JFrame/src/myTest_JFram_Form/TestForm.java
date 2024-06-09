package myTest_JFram_Form;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

@SuppressWarnings("serial")
public class TestForm extends JFrame {
	private JTextField txtName;
	public TestForm() {
		getContentPane().setLayout(null);
		setLocation(400, 200);
		setSize(500, 300);
		JButton btnShowMsg = new JButton("Show");
		btnShowMsg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String strName= txtName.getText();
				JOptionPane.showMessageDialog(null, "Welcome: " + strName);
			}
		});
		btnShowMsg.setBounds(210, 138, 129, 30);
		getContentPane().add(btnShowMsg);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(38, 32, 70, 15);
		getContentPane().add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(154, 30, 227, 19);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(172, 200, 167, 19);
		getContentPane().add(dateChooser);
	}
}
