import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int i = 10000;
        boolean flag = true;

        while(i < 99999){
            if(i % a == b && i % c == d) {
                System.out.print(i + " ");
                flag = false;
            }
            i++;
        }
        if(flag)
            System.out.println("-1");
    }
}
