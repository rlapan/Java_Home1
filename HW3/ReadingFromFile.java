package HW3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadingFromFile {
	
	
	
	public static HashMap<Integer,String> readFileToHashMap (String filename) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//String separator = File.separator;
	
		//String path = "C:" + separator + "Users" + separator + "Roman Lapan" + separator + "Desktop" + separator
			//	+ "Roman1.txt";

		File file = new File(filename); 
		HashMap<Integer, String> hashMap= new HashMap<>(); 

		Scanner scanner = new Scanner(file);
		Integer i = 0;
		while (scanner.hasNextLine()) {
			hashMap.put(i++, scanner.nextLine());
		}
		scanner.close();
		return hashMap;
	}

}
