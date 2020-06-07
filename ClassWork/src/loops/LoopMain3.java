package loops;

public class LoopMain3 {
    public static void main(String[] args) {
        int [] array = new int [10];
        for (int element : array){
            System.out.println(element);
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                int element = array[i];
                System.out.println(element); //first equal second
            }
        }
    }

    }
