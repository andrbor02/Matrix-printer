import java.util.*;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(US);
        double x = in.nextDouble();
        double y = in.nextDouble();

        if ((x <= 0 && y > x && y < 2 - x * x) || (x > 0 && y >= 0 && y < 2 - x * x))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}