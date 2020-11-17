import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[][] a = new int[N][M];
        int[][] b = new int[M][N];

        for(int x = 0; x < N; x++){
            for(int y = 0; y < M; y++){
                a[x][y] = in.nextInt();
            }
        }

        int copy_N;
        for(int x = 0; x < M; x++){
            copy_N = N;
            for(int y = 0; y < N; y++){
                b[x][y] = a[copy_N - 1][x];
                if(copy_N > 1)
                    copy_N--;
            }
        }
        
        System.out.println(M + " " + N);
        for(int x = 0; x < M; x++){
            for(int y = 0; y < N; y++){
                System.out.print(b[x][y] + " ");
            }
            System.out.print("\n");
        }
    }
}