package homework2;

public class Task2 {
    public static void main(String[] args) throws Exception
    {
        int i = 10, j = 10;
        int a = 1, b = 1;
        while(i-- > 0){
            while(j-- > 0)
                System.out.print(a*(b++) + " ");
            b = 1; j = 10;
            System.out.println();
            a++;
        }
    }
}


