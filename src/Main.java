import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        double sum = 0;
        boolean flag = true;
        int count = 0;

        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();

        for(int y = 0; y < n; y++) {
            if (a[y] % 2 != 0) {
                sum += a[y];
                flag = false;
                count++;
            }
        }
        if(flag)
            System.out.println("NO");
        else
            System.out.printf("%.2f",sum/count);
    }
}