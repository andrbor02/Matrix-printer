import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int i = 0;
        while(A / 10 != 0){
            A /= 10;
            i++;
        }
        System.out.println(i + 1);
    }
}