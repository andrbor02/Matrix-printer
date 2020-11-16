import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];

        for(int i = 0; i < N; i++)
            a[i] = in.nextInt();

        for(int i = 0; i < N; i += 1) {
            if (a[i] % 2 == 0)
                System.out.print(a[i] + " ");
        }
    }
}