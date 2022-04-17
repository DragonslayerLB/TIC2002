import java.util.ArrayList;
import java.util.Scanner;

/*
 * General utility class
 * */
public class Utility {
    /*
     * Reads the next line of user input
     * */
    public static String getNextLineOfInput() {
        String line;
        Scanner in = new Scanner(System.in);
        line = in.nextLine();

        return line;
    }

    public static void printToConsoleEnumerated(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.println((i + 1) + ". " + list.get(i));
    }
}
