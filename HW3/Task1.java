package HW3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.UUID;
import java.util.Collections;

public class Task1 {

	public static void main(String[] args) {

		Collection<String> collection = randCollectionString();
		printColletion(collection);

		// TODO Auto-generated method stub
	}

	public static void printColletion(Collection<String> collection) {
		for (String printString : collection) {
			System.out.println(printString);
		}
	}

	public static String generateRandomString(int length) {
		String letters = new String("abcdefghijklmnopqrstuvwxyz");
		StringBuffer finalWord = new StringBuffer();

		int randomIndex = 0;
		for (int i = 0; i < length; i++) {
			randomIndex = new Random().nextInt(letters.length()); // System.out.println(randomIndex);
			finalWord.append(letters.charAt(randomIndex));
		}

		return finalWord.toString();

	}

	public static Collection<String> randCollectionString() {

		Collection<String> collection = new ArrayList<>();
		Random r = new Random();
		int n = 1 + r.nextInt(100);

		for (int i = 0; i < n; i++) {
			int length = 6 + r.nextInt(10);
			collection.add(generateRandomString(length));
		}
		/*
		 * collection.add("abcdef"); collection.add("abcdefg");
		 * collection.add("abcdefgh"); collection.add("abcdefghi");
		 * collection.add("abcdefghij"); collection.add("abcdefghijk");
		 * collection.add("abcdefghijkl"); collection.add("abcdefghijklm");
		 * collection.add("abcdefghijklmn"); collection.add("abcdefghijklmno");
		 */

		return collection;

	}
}
