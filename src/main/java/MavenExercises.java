import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something");
        String something = scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static String returnNumMessage (String input) {
        return (StringUtils.isNumeric(input)) ? "is a number" : "is not a number";
    }
}
