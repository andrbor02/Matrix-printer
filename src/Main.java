import java.util.*;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(US);
        double x = in.nextDouble();
        double y = in.nextDouble();

        if (y < x && x < 2 && x * x + y * y > 4 && y > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}