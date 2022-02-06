package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.Product;
import service.CalculationService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

			String line = reader.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = reader.readLine();
			}

			Product x = CalculationService.max(list);
			System.out.println("Most expensive: " + x);

		} catch (IOException e) {
			System.out.println("file not found");
		}

	}

}
