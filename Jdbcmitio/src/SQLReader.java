import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class SQLReader {
	JDBCConnector accessor = null;

	public ArrayList<String> verarbeiteDatei(String fileName) {

		// Generics d.h <String>
		ArrayList<String> al = new ArrayList<String>();
		File f = new File(fileName);
		if (!f.exists()) {
			return al;
		}
		try (LineNumberReader fReader = new LineNumberReader(new FileReader(f))) {

			String sLine = null;
			String Teil = "";

			while ((sLine = fReader.readLine()) != null) {
				// untersuche sLine
				Teil = Teil + sLine;
				if (Teil.endsWith(";")) {
					al.add(Teil.trim());
					// fonction hier is whitespace removed.
					Teil = "";
				}
			}
			return al;
		} catch (Exception ex) {

		}
		return al;

	}

	public boolean verarbeiteSQL(ArrayList<String> befehle) throws Exception {
		for (String s : befehle) {
			System.out.println(s);

			if (s.startsWith("i") || s.startsWith("I")) {
				try {
					accessor.doInsert(s);
				} catch (Exception ex) {

				}
			}
			if (s.startsWith("c") || s.startsWith("C")) {
				try {
					accessor.doCreate(s);
				} catch (Exception ex) {

				}
			}
			if (s.startsWith("a") || s.startsWith("A")) {
				try {
					accessor.doAlter(s);
				} catch (Exception ex) {

				}
			}
			if (s.startsWith("u") || s.startsWith("U")) {
				try {
					accessor.doUpdate(s);
				} catch (Exception ex) {

				}
			}
			if (s.startsWith("d") || s.startsWith("D")) {
				try {
					accessor.doDelete(s);
				} catch (Exception ex) {

				}
			}

		}

		return false;
	}

	public static void main(String[] args) throws Exception {

		SQLReader reader = new SQLReader();
		reader.accessor = new JDBCConnector();
		ArrayList<String> Liste = reader.verarbeiteDatei("D:\\sql-DB\\Demodaten_hsqldb.txt");
		reader.verarbeiteSQL(Liste);
		for (String s : Liste) {
			System.out.println(s);
		}

	}

}
