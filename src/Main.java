import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int sum = 0;
        while(A >= B){
            A -= B;
            sum++;
        }
        System.out.println(sum + " " + A);
    }
}