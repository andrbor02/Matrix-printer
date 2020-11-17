import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double X = in.nextDouble();
        int N = in.nextInt();

        f(X, N);
    }

    public static void f(double a, int b) {

        for(int p = 1; p < b + 1; p++) {
            a *= 2;
            System.out.print((int)a);

            if(a >= 1)
                a--;
        }
    }
}