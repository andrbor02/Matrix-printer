import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int Max = a;

        if(b > Max)
            Max = b;
        if(c > Max)
            Max = c;

            System.out.print(Max);
    }
}