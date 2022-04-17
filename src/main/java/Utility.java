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
}
