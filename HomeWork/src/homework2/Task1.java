package homework2;

public class Task1 {
    //1. Циклы:
    // 1.1. Вывести таблицу умножения в консоль
    // 1.2. Перемножить числа от 1 до числа (включительно) введеннго через аргумент к исполняемой программе
    // 1.3. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль
    public static void main(String[] args) {
        System.out.println("Task 1.1. - Multiplication table:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }

        System.out.println("Task 1.2. - Multiplication numbers from 1 to n:");
        String arg = args[0];
        int value = Integer.parseInt(arg);

        long result = 1;
        for (int i = 1; i <= value ; i++) {
            result *= i;
        }
        System.out.println("Result is " + result);

        System.out.println("Task 1.3. - Multiplication of all digits:");
        result = 1;
        for (int i = 0; i < arg.length(); i++) {
            char c = arg.charAt(i);
            int numericValue = Character.getNumericValue(c);
            result *= numericValue;
        }
        System.out.println("Result is " + result);

    }
}
