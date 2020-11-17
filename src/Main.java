import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[][] a = new int[N][N];

        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                if (x + y == N - 1)
                    a[x][y] = 1;
                if (x + y > N - 1)
                    a[x][y] = 2;
                if (x + y < N - 1)
                    a[x][y] = 0;
            }
        }

        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                System.out.print(a[x][y] + " ");
            }
            System.out.print("\n");
        }
    }
}