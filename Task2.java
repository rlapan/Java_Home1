
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] numbers = { 8, 5, 22, 5, 22, 4, 1, 5, 5, 6 };
		System.out.println("Elements in Array ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");

		}
		System.out.print("\n");
		ArrayList<Integer> reversNumbers = new ArrayList<>();
		System.out.println("Reverse Array without dublicates ");
		for (int i = numbers.length - 1; i >= 0; i--) {
			if (!reversNumbers.contains(numbers[i])) {
				reversNumbers.add(numbers[i]);

				System.out.print(numbers[i] + " ");
			}

		}

		// for (int i = 0 ; i < numbers.size(); i++) {
		// for (int j = i; j < numbers.size(); j++) {
		// if (i!=j && numbers.get(i).equals(numbers.get(j))) {
		// numbers.remove(j); //i
		/// break;

		/*
		 * Set<Integer> setFromInt = new HashSet<>(Arrays.asList(numbers));
		 * System.out.print("\n"); System.out.println(setFromInt);
		 */

	}
}
