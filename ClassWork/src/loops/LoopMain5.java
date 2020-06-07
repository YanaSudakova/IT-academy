package loops;

import java.util.Random;

public class LoopMain5 {
    public static void main(String[] args) {
        int [] array = new int [10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("initial array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            array [i] +=10;// увеличивает значение каждого элемента на 10
        }
        System.out.println("new array"); //вывод сообщения
        for (int i = 0; i < array.length; i++){
            System.out.println(array [i] + " "); //распечатывается массив
        }
    }
}
