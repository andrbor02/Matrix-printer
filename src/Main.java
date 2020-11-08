import java.util.*;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(US);
        double x = in.nextDouble();
        double y = in.nextDouble();

        if ((x < 0 && x * x + y * y < 1 && (y < x || y > -x)) || (x >= 0 && x * x + y * y < 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}