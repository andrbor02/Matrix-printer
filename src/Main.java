import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int n = in.nextInt();
        double ans = a, i = 1;

        while (i < n / 2) {
            ans = ans * a;
            i++;
        }
        ans = ans * ans;

        if(n % 2 != 0)
            ans = ans * a;

        System.out.println((int)ans);
    }
}
