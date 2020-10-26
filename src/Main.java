import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int i = in.nextInt();
        long Ans;
        long doubled_Ans;
        //doubled doubled_A = 0;

        A = A >>> i; // сдвигаем на i бит  вправо 110001 на 2 -> 110    отличие >> от >>> https://fooobar.com/questions/26011/difference-between-and
        A = A << i; // сдвигаем на i бит влево 110 на 2 -> 11000

        System.out.println(A);

        /*int t = 0;
        while(A >= 1){
            doubled_A = doubled_A + ((A % 2) * (int)(Math.pow(10, t)));
            A = A / 2;
            t++;
        }
        System.out.println(doubled_A);*/


       // String s = Integer.toBinaryString(A);
       // System.out.println(s);
        //doubled_A = Long.parseLong(s);
       // doubled_Ans = doubled_A - (long)(doubled_A % Math.pow(10, i));
       // Ans = Long.parseLong(String.valueOf(doubled_Ans), 2);

       // System.out.println(Ans);
    }
}