import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int numb = 4;

        for(int y = 0; y < n; y++) {
            a[y] = numb + 3 * y;
            System.out.printf(a[y] + " ");
        }
    }
}