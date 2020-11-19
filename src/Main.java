import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] a = new int[n][m];

        for(int x = 0; x < n; x++){
            for(int y = 0; y < m; y++){
                a[x][y] = x * y;
            }
        }
        for(int x = 0; x < n; x++){
            for(int y = 0; y < m; y++){
                System.out.printf("%4d", a[x][y]);
            }
            System.out.println();
        }
    }
}