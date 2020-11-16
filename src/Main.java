import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int[] a = new int[N];

        for(int i = 0; i < N; i++)
            a[i] = i + 1;

        int k = B;

        for (int i = A - 1; i < B - 1; i++) {
            for (int j = A - 1; j < k - 1; j++) {
                int b = a[j];
                a[j] = a[j + 1];
                a[j + 1] = b;
            }
            k--;
        }

        int g = D;

        for (int i = C - 1; i < D - 1; i++) {
            for (int j = C - 1; j < g - 1; j++) {
                int b = a[j];
                a[j] = a[j + 1];
                a[j + 1] = b;
            }
            g--;
        }

        for(int i = 0; i < N; i++)
            System.out.print(a[i] + " ");
    }
}