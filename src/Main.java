import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int y = 0; y < n; y++)
            a[y] = in.nextInt();

        int k = n;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < k - 1; j++) {
                    int b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
            }
            k--;
        }
        for(int y = 0; y < n; y++)
            System.out.print(a[y] + " ");
    }
}