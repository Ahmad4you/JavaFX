package Employee_form;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File( "Hallo.txt");
			PrintWriter pw = new PrintWriter(f);
			pw.println("Hallo !!!!!");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
