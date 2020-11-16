import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++)
            a[i] = in.nextInt();

        for(int i = 1; i < N; i += 1) {
            if (a[i] > a[i - 1])
                count++;
        }
        System.out.print(count);
    }
}