import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(US);
        double x = in.nextDouble();
        boolean e = false;
        int r = (int)(Math.log10(x) + 1);
        if (x % 5 == 0 && r == 3)
            e = true;
        System.out.println(e);
    }
}