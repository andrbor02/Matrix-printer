import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h;
        int m;
        int s;

        h=(n/3600)%24;
        m=(n%3600)/60;
        s=(n%3600)%60;

        System.out.printf("%d:%02d:%02d", h, m, s);
    }
}
