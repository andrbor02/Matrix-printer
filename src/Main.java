import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int copy_N = N;
        int t = 0;
        do{
            copy_N /= 2;
            t++;
        }while(copy_N >= 1);

        if(N == (1 << (t - 1)))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
