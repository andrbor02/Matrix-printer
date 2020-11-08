import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();

        double bap = B / A;
        double bam = -B / A;

        if(A <= 0 && B <= 0)
            System.out.println("no such x");
        else if (A >= 0 && B > 0 || A > 0 && B == 0)
            System.out.println("any x");
        else if (A > 0 && B < 0)
            System.out.printf("x<%.1f or x>%.1f", bap, bam);
        else
            System.out.printf("%.1f<x<%.1f", bap, bam);
    }
}