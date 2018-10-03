package ec.fmia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mystery {

	public static void main(String[] args) throws Exception {

		clearConsoleA();

		printInformation();

		System.out.println("\nWelcome to program!!! ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		String binary = Integer.toBinaryString(number);
		System.out.println(binary.replaceAll("0", "").length());

	}

	public final static void clearConsoleA() {
		System.out.print("\033[H\033[2J");
	}

	public final static void printInformation() {

		// Printing Name of the system property
		System.out.println("user.dir: " + System.getProperty("user.dir"));

		// Fetches the property set with 'home' key
		System.out.println("home: " + System.getProperty("home"));
		// Resulting in Null as no property is present

		// Printing 'name of Operating System'
		System.out.println("os.name: " + System.getProperty("os.name"));

		// Printing 'JAVA Runtime version'
		System.out.println("version: " + System.getProperty("java.runtime.version"));

		// Printing 'name' property
		System.out.println("name: " + System.getProperty("name"));
		// Resulting in Null as no property is present

	}

	public final static void clearConsoleB() {
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}

}
