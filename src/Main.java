import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];

        for(int i = 0; i < N; i++)
            a[i] = in.nextInt();

        int Max = a[0];

        for(int i = 1; i < N; i += 1) {
            if (a[i] > Max)
                Max = a[i];
        }
        System.out.print(Max);
    }
}