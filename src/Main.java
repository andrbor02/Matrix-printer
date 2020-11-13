import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int sum = 0, i = 25;
        while(i < A){
            if(i % 2 == 0)
                sum += i;
            i++;
        }
        System.out.println(sum);
    }
}