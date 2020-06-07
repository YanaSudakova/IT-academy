package homework1;

public class Task1 {
    public static void main(String[] args) {
        //42 = 101010
        //15= 1111
        //not:
        System.out.println(~15); // 11111111111111111111111111110000
        //and:
        System.out.println(42&15); //‭1010‬
        int i = 42;
        System.out.println(i&=15); //‭1010‬
        //or:
        System.out.println(42|15); //‭00101111‬
        int i1 = 42;
        System.out.println(i1 |=15); //‭00101111‬
        //xor:
        System.out.println(42^15); //‭00100101‬
        int i2 = 42;
        System.out.println(i2^=15); //‭00100101‬
        //right shift:
        System.out.println(42>>15); //0
        int i3 = 42;
        System.out.println(i3>>=15); //0
        //left shift:
        System.out.println(42<<15); //‭000101010000000000000000‬
        int i4 = 42;
        System.out.println(i4<<=15); //‭000101010000000000000000‬
        //zero fill right shift:
        System.out.println(42>>>15); //0
        int i5 = 42;
        System.out.println(i5>>>=15); //0
        System.out.println("end");

        //-42 = ‭11111111111111111111111111010110‬
        // -15 = ‭11111111111111111111111111110001‬
        //not:
        System.out.println(~-15); //‭1110‬
        //and:
        System.out.println(-42&-15); //‭11111111111111111111111111010000‬
        int i6 = -42;
        System.out.println(i6 &=-15); //‭11111111111111111111111111010000‬
        //or:
        System.out.println(-42|-15); //‭11111111111111111111111111110111‬
        int i7 = -42;
        System.out.println(i7|=-15); //‭11111111111111111111111111110111‬
        //xor:
        System.out.println(-42^-15); //‭00100111‬
        int i8 = -42;
        System.out.println(i8^=-15); //‭00100111‬
        //right shift:
        System.out.println(-42>>-15); //‭11111111111111111111111111111111‬
        int i9 = -42;
        System.out.println(i9>>=-15); //‭11111111111111111111111111111111‬
        //left shift:
        System.out.println(-42<<-15); //‭11111111101011000000000000000000‬
        int i10 = -42;
        System.out.println(i10<<=-15); //‭11111111101011000000000000000000‬
        //zero fill right shift:
        System.out.println(-42>>>-15); //‭0111111111111111‬
        int i11 = -42;
        System.out.println(i11>>>=-15); //‭0111111111111111‬
    }
}
