package application;

import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}