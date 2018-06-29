
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A a[]= new A {}

		// List <A> list = new ArrayList<A>();

		ArrayList<String> deliveryCities = new ArrayList<>();

		deliveryCities.add("Toronto");
		deliveryCities.add("New York");
		deliveryCities.add("Toronto");
		deliveryCities.add("Paris");
		deliveryCities.add("LA");
		deliveryCities.add("Kyiv");
		deliveryCities.add("Warsaw");
		deliveryCities.add("Toronto");
		deliveryCities.add("Rome");

		System.out.printf("ArrayList has %d elements \n", deliveryCities.size());

		for (String City : deliveryCities) {

			System.out.println(City);
		}
		System.out.println("\n");

		for (int i = 0; i <= deliveryCities.size() / 2; i++) {
			if (deliveryCities.get(i).equals("Toronto")) {
				deliveryCities.set(i, "Roman");
			}

		}

		System.out.println("Array with changed elements in the first half ");
		for (String City : deliveryCities) {

			System.out.println(City);
		}

		// for(String City : deliveryCities){
		// System.out.println();
		// deliveryCities.indexOf(City);
		//
		// if(deliveryCities.contains("Toronto")){
		// System.out.println("indexOf \"Toronto\": " +
		// deliveryCities.indexOf("Toronto"));
		// }
		// System.out.println("ArrayList contains Toronto");

		// deliveryCities.set(0, "Roman");
		// // System.out.println("Array size " +deliveryCities.size());
		// for(String City2 : deliveryCities){
		//
		// System.out.println(City2);
		// }
		// }

		// for (int i=0;i<deliveryCities.size();i++) {

		// }

	}

}
