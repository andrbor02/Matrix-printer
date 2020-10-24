import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b;
        b = a - (a%2) + 2;
        System.out.println(b);
    }
}