package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {

		List<Integer> myIntegers = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjectcs = new ArrayList<>();

		copy(myIntegers, myObjectcs);
		printList(myObjectcs);

		copy(myDoubles, myObjectcs);
		printList(myObjectcs);

	}

	private static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number n : source) {
			destiny.add(n);
		}

	}

	private static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();

	}

}
