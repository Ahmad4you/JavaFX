package my_Calculator;

import java.awt.EventQueue;
import java.awt.Image;

import javax.imageio.ImageIO;

public class MyCalculator {

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
					System.out.println("Test test");
					// Add Image Icon
					Image img = ImageIO.read(getClass().getResource("calc.png"));
					frame.setIconImage(img);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
