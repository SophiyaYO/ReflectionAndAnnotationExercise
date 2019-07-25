package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        try {
            Constructor constructor = BlackBoxInt.class.getDeclaredConstructor();

            constructor.setAccessible(true);

            constructor.newInstance()

        } catch (NoSuchMethodException |
                IllegalAccessException |
                InstantiationException |
                InvocationTargetException exception) {

            exception.printStackTrace();

        }

        while (!"end".equalsIgnoreCase(input = scanner.nextLine())) {



        }
    }
}
