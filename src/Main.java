import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];

        for(int i = 0; i < N; i++)
            a[i] = in.nextInt();

        f(a, N);
    }

    public static void f(int[] mass, int numb) {
        int count = 0;
        double sum = 0;

        for(int p = 0; p < numb; p++) {
            if((int)Math.log10(mass[p]) == 3){
                sum += mass[p];
                count++;
            }
        }
        if(sum == 0)
            System.out.println("-1.00");
        else {
            double ans = sum / count;
            System.out.printf("%.2f", ans);
        }
    }
}