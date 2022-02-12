package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		System.out.println("conjunto a: " + a);
		System.out.println("conjunto b: " + b);

		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("\nuniao a + b: " + c);

		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("intersecao a + b: " + d);

		// diference
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(d);
		System.out.println("diferença a + b" + e);
	}

}
