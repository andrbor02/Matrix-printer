import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int i = in.nextInt();
        int Ans;
        int doubled_Ans;
        int doubled_A = 0;
        int reversed_doubled_A = 0;

        /*int t = 0;
        while(A >= 1){
            doubled_A = doubled_A + ((A % 2) * (int)(Math.pow(10, t)));
            A = A / 2;
            t++;
        }
        System.out.println(doubled_A);
        while(doubled_A > 0) {
            reversed_doubled_A = reversed_doubled_A * 10 + doubled_A % 10;
            doubled_A /= 10;
        }*/
        doubled_A = Integer.parseInt(Integer.toBinaryString(A));
        doubled_Ans = doubled_A - (int)(doubled_A % Math.pow(10, i));
        Ans = Integer.parseInt(String.valueOf(doubled_Ans), 2);

        System.out.println(Ans);
    }
}