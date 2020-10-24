import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b;
        b = a % 10;
        System.out.println(Math.abs(b));
    }
}