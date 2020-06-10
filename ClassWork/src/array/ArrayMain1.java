package array;

import java.util.Random;

public class ArrayMain1 {
    public static void main(String[] args) {
    int [] array = new int [10];
    int a = 155;
    Random rnd = new Random();
    for (int i = 0; i < array.length; i++){
        array [i] = rnd.nextInt ( 10);
    }
    printArray(array);
    System.out.print("\n add 10");
    for (int i = 0; i < array.length; i++){
        array [i] +=10;
    }
    printArray(array);
}

    public static void printArray (int[] arr) {
        System.out.println("array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
