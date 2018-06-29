
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 8, 5, 22, 5, 22, 4, 1, 5, 1, 6 };
		int Max = numbers[0];
		int Min = numbers[0];
		int lastMinIndex = 0;
		int Sum = 0;
		System.out.print("Default Array= ");
		for (int i = 0; i != numbers.length; i++) {
			System.out.print(numbers[i]+" ");
			Sum = numbers[i] + Sum;
			if (numbers[i] > Max) {
				Max = numbers[i];
			}
			if (numbers[i] <= Min) {
				Min = numbers[i];
				lastMinIndex = i;
			}

		}
		System.out.println();
		System.out.println("\n" + "Min element " + Min + "\n" + "Max element " + Max + "\n");
		double average = 1.0* Sum / numbers.length;
		System.out.println("Average quantity of all elements " + average + "\n");
		
		numbers[lastMinIndex] = new Double(average).intValue();
		System.out.println("Array after changing the mininum ");
		for (int value : numbers) {
			System.out.print(value+" ");
		}
		/*
		 * double average =0; if (numbers.length > 0) { double sum=0; for (int j=0;
		 * j<numbers.length; j++) { sum+= numbers[j]; } average =sum / numbers.length;
		 * System.out.println("Average quantity of all elements " +average); }
		 */

		/*
		 * Min = average; System.out.println(Min )
		 */; //

		/*
		 * if (Min== numbers[i]) { //
		 */
		// }

		// lastindexOf()

	}

}
