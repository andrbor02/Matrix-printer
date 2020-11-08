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
        boolean flag = false;

        if (a % 2 == 0 && b % 2 == 0 || a % 2 == 0 && c % 2 == 0 || b % 2 == 0 && c % 2 == 0)
            flag = true;

        System.out.println(flag);
    }
}