package loops;

public class LoopMain4 {
    public static void main(String[] args) {
        int [] array = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int element : array){
            if (element ==5){
                //break;
                continue;
            }
            System.out.println(element);

            }
        System.out.println("Done");
        }
    }



