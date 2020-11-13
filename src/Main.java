import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int sum = 0;
        while(A != 1){
            A /= 2;
            sum++;
        }
        System.out.println(sum + 1);
    }
}