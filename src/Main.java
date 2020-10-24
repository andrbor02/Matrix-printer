import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b, c ,d;
        b = Math.abs(a % 10);
        c = Math.abs((a % 100 - b)/10);
        d = Math.abs((a % 1000 - c)/100);
        System.out.println(b + c + d);
    }
}