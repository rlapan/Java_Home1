package HW3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task3TestManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashMap = null;
		try {
			hashMap = ReadingFromFile.readFileToHashMap("Roman1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not exist");
			return;
		}
		List<String> list2 = new ArrayList<String>();
		{
			// int key = (int) Math.pow(2, i);

			for (Integer key : hashMap.keySet()) {

				if (pow2(key)) {
					list2.add(hashMap.get(key));

				}
				// list2
			}
			WritingtoFile.writeToFile("testWriteFile", list2);
		}
	}

	public static boolean pow2(Integer key) {
		int k = 1;
		for (;;) {
			k = k * 2;
			if (k == key) {
				return true;
			}
			if (k > key) {
				return false;
			}
		}
	}

}
