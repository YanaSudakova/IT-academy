package homework2;

import java.util.Scanner;

public class Task2 {
    // 2.1 Вывести все элементы в консоль при помощи do....while, while, for, foreach. Элементы массива вводить через консоль. Массив хранит в себе числа.
    // 2.2 Вывести каждый второй элемент массива
    public static void main(String[] args) {
        int n = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Task 2.1. - do... while");
        int i = 0;
        do {
            System.out.print(a[i] + " ");
            i++;
        } while (i < a.length);

        System.out.print("\nTask 2.1. - while\n");
        int f = 0;
        while (f < a.length) {
            System.out.print(a[f] + " ");
            f++;
        }

        System.out.println("\nTask 2.1. - for");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }

        System.out.println("\nTask 2.1. - for each");
        for (int k : a) {
            System.out.print(k + " ");
        }

        System.out.println("\nTask 2.2. - Take second element of array");
        for (int l = 1; l < a.length; l = l + 2){
            System.out.print(a[l] + " ");
        }
    }
}


