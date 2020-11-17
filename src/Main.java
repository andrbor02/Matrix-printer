import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ax = in.nextInt();
        int ay = in.nextInt();
        int bx = in.nextInt();
        int by = in.nextInt();
        int cx = in.nextInt();
        int cy = in.nextInt();

        System.out.printf("%.10f", P(ax, ay, bx, by, cx, cy));
    }

    static double P (int ax, int ay, int bx, int by, int cx, int cy) {
        double d1, d2, d3;

        d1 = Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
        d2 = Math.sqrt(Math.pow(bx - cx, 2) + Math.pow(by - cy, 2));
        d3 = Math.sqrt(Math.pow(cx - ax, 2) + Math.pow(cy - ay, 2));

        double P = d1 + d2 + d3;
        return P;
    }
}