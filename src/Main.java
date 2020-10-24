import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int c = 0;
        do{
            N /= 2;
            c++;
        }while(N > 1);
        System.out.println(c+4);
        System.out.println(c+3);
        System.out.println(c+2);
        System.out.println(c+1);
        System.out.println(c);
    }
}