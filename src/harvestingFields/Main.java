package harvestingFields;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		Field[] fields = RichSoilLand.class.getDeclaredFields();

		while (!input.equals("HARVEST")) {

			switch (input) {
				case "private ":

					break;
				case "protected ":

					break;
				case "public ":

					break;
				case "all ":

					break;


			}

			input = scanner.nextLine();
		}

	}
}
