import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int i = in.nextInt();
        int N = x;
        int t = 0;
        do{
            N /= 2;
            t++;
        }while(N >= 1);
        while (t > i) {
            x &= ~(1 << (t - 1)); // сбросить бит 
            t--;
        }
        System.out.println(x);
    }
}
