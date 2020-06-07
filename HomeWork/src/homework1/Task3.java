package homework1;
import java.util.Scanner;
public class Task3 {

    public static final String PLEASE_ENTER_NAME = "Пожалуйста введите ваше имя";
    public static final String VASYA = "Вася";
    public static final String NASTYA = "Анастасия";
    public static final String I_WAS_WAITING_FOR_YOU = "Я тебя так долго ждал";
    public static final String HI = "Привет!";
    public static final String WHO_ARE_YOU = "Добрый день, а вы кто?";

    public static void main (String[] args) {
        methodWithSwitch();
        methodWithElseIf();
        methodWithIf();

    }

    private static void methodWithSwitch() {
        System.out.println("methodWithSwitch started");
        Scanner task = new Scanner(System.in);
        System.out.println(PLEASE_ENTER_NAME);
        String name = task.nextLine();
        switch (name) {
            case VASYA:
                System.out.println(HI);
                System.out.println(I_WAS_WAITING_FOR_YOU);
                break;
            case NASTYA:
                System.out.println(I_WAS_WAITING_FOR_YOU);
                break;
            default:
                System.out.println(WHO_ARE_YOU);
        }
    }

    private static void methodWithElseIf() {
        System.out.println("methodWithElseIf started");
        Scanner task = new Scanner(System.in);
        System.out.println(PLEASE_ENTER_NAME);
        String name = task.nextLine();
        if (name.equals(VASYA)) {
            System.out.println(HI);
            System.out.println(I_WAS_WAITING_FOR_YOU);
        }
        else if (name.equals(NASTYA)) {
            System.out.println(I_WAS_WAITING_FOR_YOU);
        }
        else {
            System.out.println(WHO_ARE_YOU);
        }
    }

    private static void methodWithIf() {
        System.out.println("methodWithIf started");
        Scanner task = new Scanner(System.in);
        System.out.println(PLEASE_ENTER_NAME);
        String name = task.nextLine();
        if (name.equals(VASYA)) {
            System.out.println(HI);
            System.out.println(I_WAS_WAITING_FOR_YOU);
        }
        if (name.equals(NASTYA)) {
            System.out.println(I_WAS_WAITING_FOR_YOU);
        }
        if (!name.equals(VASYA) && !name.equals(NASTYA)) {
            System.out.println(WHO_ARE_YOU);
        }
    }
}
