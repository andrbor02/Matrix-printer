import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 0, t = 2;

        while(i < N){
            System.out.print(t + " ");
            i++;
            t+= 2;
        }
    }
}
