package HW3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WritingtoFile {
	public static void writeToFile(String filename, List<String> rows) {
		File file = new File(filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {

				System.out.println("Can't create file: " + e.getMessage());
				return;
			}
		}
		PrintWriter pw;
		try {
			pw = new PrintWriter(file);
			if (rows != null) {
				for (String row : rows) {
					pw.println(row);
				}

			}

			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
