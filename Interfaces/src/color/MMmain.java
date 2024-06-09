package color;
import javax.swing.JFrame;


public class MMmain{

	public static void main(String[] args) {
		
		JFrame frm = new JFrame("Color");
		frm.setSize(500, 500);
		frm.getContentPane().setBackground(MyColor.GRREN);
		frm.setLocationRelativeTo(null);
		frm.setVisible(true);
		
		
	}

}
