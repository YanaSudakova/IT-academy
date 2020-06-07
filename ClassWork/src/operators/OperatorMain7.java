package operators;

public class OperatorMain7 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++ + ++a; //10+12
        System.out.println(b);
        a = a++ + ++a; //12+14
        System.out.println(a);
        a = a++ + ++a + a++; //26+28+28
        System.out.println(a);
        b = a ++ + ++a + a++;
        System.out.println(b);
        System.out.println(a);
    }
}
