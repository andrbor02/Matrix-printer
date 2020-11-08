import java.util.*;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(US);
        double x = in.nextDouble();
        boolean e = true;
        if (x >= -2 && x <= 3 || x >= 6 && x <= 9)
            e = false;
        System.out.println(e);
    }
}