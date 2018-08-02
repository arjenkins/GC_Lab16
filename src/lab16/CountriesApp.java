package lab16;

import java.util.List;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;

		System.out.println("===================================");
		System.out.println("|             Menu                |");
		System.out.println("===================================");
		System.out.println("| Please select an option:        |");
		System.out.println("|                                 |");
		System.out.println("| 1. View list of contries.       |");
		System.out.println("| 2. Add to the list of contries. |");
		System.out.println("| 3. Exit the program.            |");
		System.out.println("===================================");
		userNum = scnr.nextInt();
		scnr.nextLine();

		if (userNum == 1) {

			printCountries();

		} else if (userNum == 2) {
			System.out.println("Please enter the name of the country you would like to add: ");
			String userInput = scnr.nextLine();
			Country country = new Country(userInput);
			CountriesTextFile.appendLine(country);
			printCountries();

		} else {
			System.out.println("Goodbye.");
		}
		scnr.close();
	}

	public static void printCountries() {
		List<Country> oldCountry = CountriesTextFile.readFile();
		for (Country country : oldCountry) {
			System.out.println(country);
		}
	}

}
