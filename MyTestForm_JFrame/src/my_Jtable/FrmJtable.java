package my_Jtable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FrmJtable extends JFrame {

	private JPanel contentPane;
	private JTable tblEmp;
	private JLabel lblSalary;
	private JTextField txtName;
	private JTextField txtSalary;
	private JButton btnDelete;
	DefaultTableModel model;
	int currentRow;

	private void getTable() {
		model =  (DefaultTableModel) tblEmp.getModel();
	}
	
	private void clearText() {
		txtName.setText("");
		txtSalary.setText("");
	}
	/**
	 * Create the frame.
	 */
	public FrmJtable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 124, 360, 211);
		contentPane.add(scrollPane);
		
		tblEmp = new JTable();
		tblEmp.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Salary"
			}
		));
		tblEmp.getColumnModel().getColumn(0).setPreferredWidth(212);
		tblEmp.getColumnModel().getColumn(1).setPreferredWidth(224);
		scrollPane.setViewportView(tblEmp);
		
		JLabel lblEployeeName = new JLabel("Eployee Name");
		lblEployeeName.setBounds(52, 12, 116, 15);
		contentPane.add(lblEployeeName);
		
		lblSalary = new JLabel("Salary");
		lblSalary.setBounds(52, 39, 70, 15);
		contentPane.add(lblSalary);
		
		txtName = new JTextField();
		txtName.setBounds(196, 10, 216, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtSalary = new JTextField();
		txtSalary.setBounds(196, 37, 216, 19);
		contentPane.add(txtSalary);
		txtSalary.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getTable();
				model.addRow(new Object[] {txtName.getText(), txtSalary.getText()});
				clearText();
			}
		});
		btnAdd.setBounds(45, 66, 117, 25);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getTable();
				currentRow = tblEmp.getSelectedRow();
				model.setValueAt(txtName.getText(), currentRow, 0);
				model.setValueAt(txtSalary.getText(), currentRow, 1);
				clearText();
			}
		});
		btnUpdate.setBounds(169, 66, 117, 25);
		contentPane.add(btnUpdate);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getTable();
				currentRow = tblEmp.getSelectedRow();
				model.removeRow(currentRow);
				clearText();
			}
		});
		btnDelete.setBounds(295, 66, 117, 25);
		contentPane.add(btnDelete);
	}
}
