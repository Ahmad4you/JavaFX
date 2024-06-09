package taschenrechner;

import java.awt.EventQueue;
import java.awt.Toolkit;

public class Taschenrechner {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRechner frame = new TRechner();
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
