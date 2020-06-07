package operators;
import java.util.Objects;
import java.util.Scanner;
public class OperatorMain11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pastae name");
        String spagettiName = scanner.nextLine();
        if (Objects.equals(spagettiName, "Barilla")){
            System.out.println("Buy");
        }
         else if (Objects.equals(spagettiName, "Makfa")){
                System.out.println("Buy");
         }
         else if (Objects.equals(spagettiName, "Rolton")){
                    System.out.println("Buy");
         }
         else {
             System.out.println("Buy");
         }
        }

    }

