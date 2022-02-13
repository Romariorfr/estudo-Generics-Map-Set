package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// c:\temp\in.txt
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		Map<String, Integer> listVotes = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				Integer value = Integer.parseInt(fields[1]);

				if (listVotes.containsKey(name)) {
					int votes = listVotes.get(name);
					listVotes.put(name, value + votes);
				} else {
					listVotes.put(name, value);

				}

				line = br.readLine();

			}

			for (String key : listVotes.keySet()) {
				System.out.println(key + " : " + listVotes.get(key));
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");

		} catch (IOException e) {
			System.out.println("Error!");

		}

		sc.close();

	}

}
