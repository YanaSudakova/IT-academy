package operators;
import java.util.Scanner;
public class OperatorMain12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = scanner.nextInt();
        switch (a){
            default:
                int b = 10;
                System.out.println("I quit!" + b + "it is not enough");
                break;
            case 10:
                b = 20;
                System.out.println("Yeeeei, 10!");
                System.out.println("But it would be nice to see more");
                break;
            case 20:
                System.out.println("That is enough");
                break;
        }
        System.out.println("I am going to the bar");
    }
}
