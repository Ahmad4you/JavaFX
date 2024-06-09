package taschenrechner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TRechner extends JFrame {

	private JPanel contentPane;
	private JTextField txtnum1;
	private JTextField txtnum2;
	private JLabel lblOpe;
	private JLabel lblResult;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TRechner frame = new TRechner();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	
	public TRechner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTaschenrechner = new JLabel("Taschenrechner");
		lblTaschenrechner.setFont(new Font("DejaVu Serif", Font.BOLD, 20));
		lblTaschenrechner.setBounds(128, 0, 209, 39);
		contentPane.add(lblTaschenrechner);
		
		JLabel lblNummer = new JLabel("Nummer1");
		lblNummer.setFont(new Font("DejaVu Serif", Font.BOLD, 12));
		lblNummer.setBounds(28, 59, 70, 15);
		contentPane.add(lblNummer);
		
		txtnum1 = new JTextField();
		txtnum1.setDropMode(DropMode.INSERT);
		txtnum1.setBounds(148, 57, 237, 19);
		contentPane.add(txtnum1);
		txtnum1.setColumns(10);
		
		JLabel lblNummer_1 = new JLabel("Nummer2");
		lblNummer_1.setFont(new Font("DejaVu Serif", Font.BOLD, 12));
		lblNummer_1.setBounds(28, 98, 70, 15);
		contentPane.add(lblNummer_1);
		
		txtnum2 = new JTextField();
		txtnum2.setBounds(148, 96, 237, 19);
		contentPane.add(txtnum2);
		txtnum2.setColumns(10);
		
		lblResult = new JLabel("0");
		lblResult.setFont(new Font("DejaVu Serif", Font.BOLD, 18));
		lblResult.setBounds(28, 211, 253, 27);
		contentPane.add(lblResult);
		
		lblOpe = new JLabel("0");
		lblOpe.setFont(new Font("DejaVu Serif", Font.BOLD, 18));
		lblOpe.setBounds(390, 76, 33, 19);
		contentPane.add(lblOpe);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(299, 226, 117, 25);
		contentPane.add(btnExit);
		
		
		JButton btnAdd = new JButton("+");
		  btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOpe.setText("+");  // es wird nicht genutzt, wenn wir die Methode mit parameter definieren
					calc("+");
				
			}
		});
		btnAdd.setBounds(28, 174, 70, 25);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOpe.setText("-");
					calc("-");
			}	
		});
		btnSub.setBounds(110, 174, 70, 25);
		contentPane.add(btnSub);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOpe.setText("/");			
					
				JOptionPane.showMessageDialog(null, calc("/"));
			}
		});
		btnDiv.setBounds(190, 174, 70, 25);
		contentPane.add(btnDiv);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOpe.setText("*");	
					calc("*");
			
			}
		});
		btnMulti.setBounds(268, 174, 70, 25);
		contentPane.add(btnMulti);
		
		JButton btnModulo = new JButton("%");
		btnModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOpe.setText("%");
					calc("%");
			
			}
		});
		btnModulo.setBounds(347, 174, 70, 25);
		contentPane.add(btnModulo);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtnum1.selectAll();
				txtnum1.replaceSelection("");
				txtnum2.selectAll();
				txtnum2.replaceSelection("");
				lblResult.setText("");
				lblOpe.setText("");
			}
		});
		btnC.setBounds(299, 200, 117, 25);
		contentPane.add(btnC);
		
	}

	private String calc(String ope) {
//		private void calc(String ope) {
		double num1 = Double.parseDouble(txtnum1.getText());
		double num2 = Double.parseDouble(txtnum2.getText());
		double result = 0;
//		if(lblOpe.getText().equals("+"))
		if(ope.equals("+"))
			result = num1 + num2;
//		else if(lblOpe.getText().equals("-"))
		else if(ope.equals("-"))
			result = num1 - num2;
		else if(ope.equals("*"))
			result = num1 * num2;
		else if(ope.equals("/"))
			result = num1 / num2;
		else
			result = num1 % num2;
		
		lblResult.setText(String.valueOf(result));
		return String.valueOf(result);
	}
	protected JLabel getLblOpe() {
		return lblOpe;
	}
	protected JLabel getLblResult() {
		return lblResult;
	}
	
}
