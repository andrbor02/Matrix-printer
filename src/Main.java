import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int t = 0;

        for(int y = 0; y < n; y++)
            a[y] = in.nextInt();

        for(int x = 0; x < n; x++){
            if(a[x] < 0) {
                b[t] = a[x];
                t++;
            }
        }
        for(int x = 0; x < n; x++){
            if(a[x] >= 0) {
                b[t] = a[x];
                t++;
            }
        }
        for(int y = 0; y < n; y++)
            System.out.print(b[y] + " ");

    }
}