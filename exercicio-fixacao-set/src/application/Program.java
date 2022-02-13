package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		registrationStudents("How many students for course A?", a);
		registrationStudents("How many students for course B?", b);
		registrationStudents("How many students for course C?", c);

		Set<Integer> totalStudens = new HashSet<>(a);
		totalStudens.addAll(b);
		totalStudens.addAll(c);

		System.out.println("Total students: " + totalStudens.size());

		sc.close();
	}

	private static void registrationStudents(String msg, Set<Integer> list) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int studen = sc.nextInt();
			list.add(studen);
		}

	}

}
