package advenced_Tachenrechner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FrmCalc extends JFrame {

	private JPanel contentPane;
	private JTextField txtAll;
	double num1;
	double num2;
	double result;
	char ope;
	
	
	private void setAll(String s) {
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
		setBounds(100, 100, 302, 310);
		contentPane = new JPanel();
		contentPane.setFont(new Font("DejaVu Serif", Font.PLAIN, 11));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAll = new JTextField();
		txtAll.setFont(new Font("DejaVu Serif", Font.BOLD, 24));
		txtAll.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAll.setBounds(23, 12, 254, 33);
		contentPane.add(txtAll);
		txtAll.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll("0");
			}
		});
		btn0.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btn0.setBounds(77, 225, 50, 40);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll("1");
			}
		});
		btn1.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btn1.setBounds(23, 184, 50, 40);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll("2");
			}
		});
		btn2.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btn2.setBounds(77, 184, 50, 40);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll("3");
			}
		});
		btn3.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btn3.setBounds(132, 184, 50, 40);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll("4");
			}
		});
		btn4.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btn4.setBounds(23, 142, 50, 40);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll("5");
			}
		});
		btn5.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btn5.setBounds(77, 142, 50, 40);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll("6");
			}
		});
		btn6.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btn6.setBounds(132, 142, 50, 40);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll("7");
			}
		});
		btn7.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btn7.setBounds(23, 100, 50, 40);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll("8");
			}
		});
		btn8.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btn8.setBounds(77, 100, 50, 40);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll("9");
			}
		});
		btn9.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btn9.setBounds(132, 100, 50, 40);
		contentPane.add(btn9);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAll(".");
			}
		});
		btnDot.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btnDot.setBounds(132, 225, 50, 40);
		contentPane.add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(txtAll.getText());
				switch(ope) {
				case '+': result = num1 + num2; break;
				case '-': result = num1 - num2; break;
				case '*': result = num1 * num2; break;
				case '/': result = num1 / num2; break;
				}
//				txtAll.setText(String.valueOf(result));
				txtAll.setText(String.format("%.2f",result));  //ohne nachkomma 0f= null komma, 1f= 1 komma
			}
		});
		btnEqual.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btnEqual.setBounds(23, 225, 50, 40);
		contentPane.add(btnEqual);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAll.setText("");
			}
		});
		btnClear.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btnClear.setBounds(23, 58, 104, 40);
		contentPane.add(btnClear);
		
		JButton btnPlusOrMinus = new JButton("+/-");
		btnPlusOrMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(txtAll.getText());
				num = num * (-1);
				txtAll.setText(String.valueOf(num));
			}
		});
		btnPlusOrMinus.setFont(new Font("DejaVu Serif", Font.BOLD, 10));
		btnPlusOrMinus.setBounds(132, 57, 50, 40);
		contentPane.add(btnPlusOrMinus);
		
		JButton btnOff = new JButton("OFF");
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnOff.setForeground(Color.RED);
		btnOff.setFont(new Font("DejaVu Serif", Font.BOLD, 11));
		btnOff.setBounds(217, 57, 60, 40);
		contentPane.add(btnOff);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpe('+');
			}
		});
		btnAdd.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btnAdd.setBounds(217, 101, 60, 40);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpe('-');
			}
		});
		btnSub.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btnSub.setBounds(217, 143, 60, 40);
		contentPane.add(btnSub);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpe('*');
			}
		});
		btnMulti.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btnMulti.setBounds(217, 184, 60, 40);
		contentPane.add(btnMulti);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOpe('/');
			}
		});
		btnDiv.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		btnDiv.setBounds(217, 225, 60, 40);
		contentPane.add(btnDiv);
	}
	
}
