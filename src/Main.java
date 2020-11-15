import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int y = 0; y < n; y++)
            a[y] = in.nextInt();

        int[] list = new int[n];

        int i, j, count, maxcount, num, len;

        len = 0; maxcount = 1; num = 0;
        for (i = 0; i < n; i++) {
            count=0;
            for (j = i; j < n; j++)
                if (a[i] == a[j])
                    count++;
            if (count == maxcount) {
                list[len] = i;
                len++;
            }
            if (count > maxcount) {
                maxcount = count;
                num = i;
                len = 1;
                list[0] = i;
            }
        }
            System.out.print(a[list[0]]);
    }
}