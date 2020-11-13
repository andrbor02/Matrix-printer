import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            int a = in.nextInt();

            if((int)Math.log10(a) != 1)
                break;

            sum += a % 10 + a / 10;
        }
        System.out.println(sum);
    }
}