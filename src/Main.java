import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int Max = a;
        int n1 = b, n2 = c;

        if(a > b + c || b > a + c || c > a + b || a <= 0 || b <= 0 || c <= 0)
            System.out.println("impossible");
        else{

            if(b > Max) {
                Max = b;
                n1 = a;
                n2 = c;
            }
            if(c > Max) {
                Max = c;
                n1 = a;
                n2 = b;
            }

            if(Max * Max == n1 * n1 + n2 * n2)
                System.out.println("right");
            if(Max * Max < n1 * n1 + n2 * n2)
                System.out.println("acute");
            if(Max * Max > n1 * n1 + n2 * n2)
                System.out.println("obtuse");
        }
    }
}