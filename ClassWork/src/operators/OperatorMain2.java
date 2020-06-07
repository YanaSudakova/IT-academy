package operators;

public class OperatorMain2 {
    public static void main (String [] args){
        int a = plus(Integer.MAX_VALUE, Integer.MAX_VALUE);
        int z = plus (123, 1);
    }

    public static int plus (int a, int b){
        return a + b;
    }
}
