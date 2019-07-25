package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Field[] fields = RichSoilLand.class.getDeclaredFields();

        while (!input.equals("HARVEST")) {

            switch (input) {

                case "private":
                    Arrays.stream(fields)
                            .filter(field -> Modifier.isPrivate(field.getModifiers()))
                            .forEach(field ->
                                    System.out.println(
                                    String.format(
                                    "private %s %s",
                                    field.getType().getSimpleName(),
                                    field.getName()
                            )));

                    break;
                case "protected":
                    Arrays.stream(fields)
                            .filter(field -> Modifier.isProtected(field.getModifiers()))
                            .forEach(field ->
                                    System.out.println(
                                            String.format(
                                                    "protected %s %s",
                                                    field.getType().getSimpleName(),
                                                    field.getName()
                                            )));
                    break;
                case "public":

                    break;
                case "all":

                    break;
                default:
                    break;


            }

            input = scanner.nextLine();
        }

    }
}
