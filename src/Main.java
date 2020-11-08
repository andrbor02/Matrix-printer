import java.util.*;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(US);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && b > c)
            System.out.println(c + " " + b + " " + a);
        if (a > c && c > b)
            System.out.println(b + " " + c + " " + a);
        if (b > a && a > c)
            System.out.println(c + " " + a + " " + b);
        if (b > c && c > a)
            System.out.println(a + " " + c + " " + b);
        if (c > a && a > b)
            System.out.println(b + " " + a + " " + c);
        if (c > b && b > a)
            System.out.println(a + " " + b + " " + c);
    }
}