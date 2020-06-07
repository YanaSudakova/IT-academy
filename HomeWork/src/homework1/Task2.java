package homework1;

public class Task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;
        int d = 7;
        int e = 20;
        int f = 68;
        int g = 22;
        int h = 6;
        int i = 3;
        int j = 12;
        int k = 119;
        boolean l = true;
        boolean m = false;

        System.out.println(a + b / c); // 2/8=0 (int - число без точки) > 5+0=5
        System.out.println((a + b) / c); // 5+2=7 > 7/8=0 (int - число без точки)
        System.out.println((a + b++) / c); // 5+2=7 > b=3 > 7/8=0 (int - число без точки)
        System.out.println((a + b++) / --c); // 5+2=7 > 8-1=7 > 7/7=1
        System.out.println((a * b >> b++) / --c); // 5*2=10 > 2+1=3 > 10>>3=1 > 8-1=7 > 1/7=0 (int - число без точки)
        System.out.println((a + d > e ? f : g * b >> b++) / --c); //(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8    5+7<20, выполняется 22*2=44 > 2+1=3 > 44>>3=5 > 5/8=0 (int - число без точки)
        //System.out.println((a + d > e ? f >= f : g * b >> b++) / --c); в скобках получается false > false / --c - boolean не может работать с числом
        System.out.println(h - b > i && j * j <= k); //6-2=4 > 4>3 true > 12*12=144 > 144 >119 false > true&&false=false
        System.out.println(l&&m);//true&&false=false
    }
}
