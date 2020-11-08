import java.util.*;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(US);
        double x = in.nextDouble();
        boolean e = false;
        if (x >= 3 && x <= 8)
            e = true;
        System.out.println(e);
    }
}