import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int i = 2;
        boolean flag = true;

        while (i < A && flag) {
            if ((A % i) == 0) {
                flag = false;
                continue;
            }
            i++;
        }
        if(flag)
            System.out.println("prime");
        else
            System.out.println("composite");
    }
}
