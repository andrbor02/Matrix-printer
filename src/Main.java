import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int i;
        boolean flag;

        A += 1;

        do{
            i = 2;
            flag = true;
            while (i < A && flag) {
                if ((A % i) == 0) {
                    flag = false;
                    continue;
                }
                i++;
            }
            A++;
        }while (!flag);
        System.out.println(A - 1);
    }
}