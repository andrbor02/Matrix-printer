import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] elem = new int[10000];
        int b = 0;

        for(int j = 0; j < N; j++)
            elem[j] = in.nextInt();

        for(int i = 0; i < N; i++) {
            if(elem[i] != 0) {
                System.out.print(elem[i] + " ");
                b++;
            }
        }
        for(int k = 0; k < (N - b); k++)
            System.out.print(0 + " ");
    }
}

// 12