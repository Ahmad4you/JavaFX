package show_Bild;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class BShown extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BShown frame = new BShown();
					frame.setVisible(true);
					
					// add Icon to this Form
					frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("instagram.png")));
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BShown() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImg = new JLabel("");
		lblImg.setBounds(34, 12, 800, 480);
		contentPane.add(lblImg);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setBounds(771, 526, 117, 25);
		contentPane.add(btnExit);
		
		JButton btnShowImg = new JButton("Show Img");
		btnShowImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					File f = new File("logo.jpg");
					Image img = ImageIO.read(f);
					ImageIcon icon = new ImageIcon(img);
					lblImg.setIcon(icon);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println(e1);
				}
				
				
			}
		});
		btnShowImg.setBounds(485, 526, 117, 25);
		contentPane.add(btnShowImg);
		
		JButton btnChoose = new JButton("Show img2");
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fram2 f2 = new Fram2();
				f2.setVisible(true);
				f2.setLocationRelativeTo(null);
			}
		});
		btnChoose.setBounds(243, 526, 117, 25);
		contentPane.add(btnChoose);
		
		JButton btnChooseImage = new JButton("choose Image");
		btnChooseImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				FileNameExtensionFilter filter = new 
						FileNameExtensionFilter("Image Files", "Jpg", "jpeg", "png");
				fc.setFileFilter(filter);
				fc.showDialog(null, "Select Image");
				
				try {
					Image img = ImageIO.read(fc.getSelectedFile()); //Img without Scale (in original size)
					Image newImg = img.getScaledInstance(800, 480, Image.SCALE_AREA_AVERAGING); // scaled size
					lblImg.setIcon(new ImageIcon(newImg));
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnChooseImage.setBounds(12, 526, 132, 25);
		contentPane.add(btnChooseImage);
	}
}
