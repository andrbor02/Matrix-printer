import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int ans;
        ans = ((a * 100 + b) * n);
        System.out.println((ans - ans % 100) / 100 + " " +ans % 100);
    }
}