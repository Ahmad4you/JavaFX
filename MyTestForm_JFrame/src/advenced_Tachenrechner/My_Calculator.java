package advenced_Tachenrechner;

import java.awt.EventQueue;
import java.awt.Toolkit;

public class My_Calculator {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCalc frame = new FrmCalc();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
					// add Icon to this Form
					frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("calculator.png")));
//					Image img = ImageIO.read(getClass().getResource("instagram.png"));
//					frame.setIconImage(img);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}

}
