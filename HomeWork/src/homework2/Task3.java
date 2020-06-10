package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    //Выполнить сортировку массива с числами:
    // 3.1 пузырьком
    // 3.2 выбором
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

        System.out.println("Task 3.1. - Bubble sort");

        bubbleSort(a);

        for (int i1 : a) {
            System.out.println(i1);
        }

        System.out.println("Task 3.1. - Selection sort");
        selectionSort(a);
        for (int i2 : a) {
            System.out.println(i2);
        }
    }

    private static void selectionSort(int[] a) {
        int i;
        for (i = 0; i < a.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }

    private static void bubbleSort(int[] a) {
        int i;
        int j;
        int k;
        boolean swapped;
        for (i = 0; i < a.length - 1; i++) {
            swapped = false;
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    k = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = k;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
