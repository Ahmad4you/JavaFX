package my_Calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class FrmCalc extends JFrame {

	private JPanel contentPane;
	private JTextField txtAll;
	double num1;
	double num2;
	double result;
	char ope;
	
	private void getAll(String s) {
		String all = txtAll.getText() + s;
		txtAll.setText(all);
	}
	
	private void setOpe(char operation) {
		num1 = Double.parseDouble(txtAll.getText());
		txtAll.setText("");
		ope = operation;
	}


	/**
	 * Create the frame.
	 */
	public FrmCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAll = new JTextField();
		txtAll.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtAll.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAll.setBounds(27, 21, 236, 35);
		contentPane.add(txtAll);
		txtAll.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll("0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBounds(78, 240, 50, 40);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll("1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(128, 199, 50, 40);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll("2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(78, 199, 50, 40);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll("3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(27, 199, 50, 40);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll("4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(128, 158, 50, 40);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll("5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(78, 158, 50, 40);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll("6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(27, 158, 50, 40);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll("7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBounds(128, 118, 50, 40);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll("8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(78, 118, 50, 40);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll("9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(27, 118, 50, 40);
		contentPane.add(btn9);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getAll(".");
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBounds(128, 240, 50, 40);
		contentPane.add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(txtAll.getText());
				switch(ope) {
				case '+' : result = num1 + num2; break;
				case '-' : result = num1 - num2; break;
				case '*' : result = num1 * num2; break;
				case '/' : result = num1 / num2; break;
				}
//				txtAll.setText(String.valueOf(result));
				txtAll.setText(String.format("%.2f", result));
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEqual.setBounds(27, 240, 50, 40);
		contentPane.add(btnEqual);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAll.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(27, 77, 101, 40);
		contentPane.add(btnClear);
		
		JButton btnPlusOrMinus = new JButton("+/-");
		btnPlusOrMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(txtAll.getText());
				num = num * (-1);
				txtAll.setText(String.valueOf(num));
			}
		});
		btnPlusOrMinus.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnPlusOrMinus.setBounds(128, 77, 50, 40);
		contentPane.add(btnPlusOrMinus);
		
		JButton btnOff = new JButton("Off");
		btnOff.setForeground(Color.RED);
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
				dispose();
			}
		});
		btnOff.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOff.setBounds(203, 77, 60, 40);
		contentPane.add(btnOff);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpe('+');
			}
		});
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.setBounds(203, 118, 60, 40);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpe('-');
			}
		});
		btnSub.setForeground(Color.BLACK);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSub.setBounds(203, 158, 60, 40);
		contentPane.add(btnSub);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpe('*');
			}
		});
		btnMulti.setForeground(Color.BLACK);
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMulti.setBounds(203, 199, 60, 40);
		contentPane.add(btnMulti);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpe('/');
			}
		});
		btnDiv.setForeground(Color.BLACK);
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDiv.setBounds(203, 240, 60, 40);
		contentPane.add(btnDiv);
	}
}
