package myChooseFile;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class FrmCF extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCF frame = new FrmCF();
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
	public FrmCF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 39, 405, 124);
		contentPane.add(scrollPane);
		
		JTextArea txtpath = new JTextArea();
		txtpath.setFont(new Font("DejaVu Serif", Font.BOLD, 14));
		txtpath.setLineWrap(true);
		txtpath.setWrapStyleWord(true);
		scrollPane.setViewportView(txtpath);
		
		JButton btnChoose = new JButton("Choose");
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				JFileChooser fc = new JFileChooser();
				fc.showDialog(btnChoose, "Choose File");
				String path = txtpath.getText() + "\n" + fc.getSelectedFile().toString();
				txtpath.setText(path);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		btnChoose.setBounds(163, 190, 117, 25);
		contentPane.add(btnChoose);
	}
}
