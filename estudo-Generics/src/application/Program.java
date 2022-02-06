package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final PrintService<String> service = new PrintService<>();

		System.out.print("how many values? ");
		int totalValues = sc.nextInt();

		for (int i = 0; i < totalValues; i++) {
			service.addValue(sc.next());
		}

		service.print();

		sc.close();

	}

}
