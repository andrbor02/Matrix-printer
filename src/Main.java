import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        System.out.println(min(A, B, C, D));
    }

    static int min (int a, int b, int c, int d) {
        int Min = a;
        if(b < Min)
            Min = b;
        if(c < Min)
            Min = c;
        if(d < Min)
            Min = d;
        return Min;
    }
}