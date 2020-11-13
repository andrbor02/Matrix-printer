import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            int a = in.nextInt();
            if(a > 10)
            sum += a;
            if(a % 5 == 0)
                break;
        }
        System.out.println(sum);
    }
}