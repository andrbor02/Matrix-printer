import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(US);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        boolean flag = false;

        if (a + b == 0 || a + c == 0 || a + d == 0 || b + c == 0 || b + d == 0 || c + d == 0)
            flag = true;

        System.out.println(flag);
    }
}