import java.util.*;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(US);
        int x = in.nextInt();

        if (x >= 0 && (int)Math.log10(x) == 0 || x == 0)
            System.out.println("DIGIT");
        else if (x >= 0 && (int)Math.log10(x) == 1)
            System.out.println("NUM");
        else
            System.out.println("OTHER");
    }
}