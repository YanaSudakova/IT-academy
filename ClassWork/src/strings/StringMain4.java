package strings;

import java.util.Scanner;

public class StringMain4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Yana";
        String name = scanner.nextLine();

        System.out.println(str == name);
        System.out.println(str.equals(name));
        System.out.println(str.equalsIgnoreCase(name));
    }
}
