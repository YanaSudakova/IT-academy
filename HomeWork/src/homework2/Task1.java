package homework2;

public class Task1 {
    //1. Циклы:
    // 1.1. Вывести таблицу умножения в консоль
    //    1.2. Перемножить числа от 1 до числа (включительно) введеннго через аргумент к исполняемой программе
    //    1.3. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль
    public static void main(String[] args) {
        System.out.println("Task 1.1. - Multiplication table:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}

