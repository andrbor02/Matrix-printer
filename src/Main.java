import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] a = new int[n][m];

        int i = 0;
        for(int x = 0; x < n; x++){
            if(x % 2 == 0) {
                for (int y = 0; y < m; y++) {
                    a[x][y] = i;
                    i++;
                }
            }
            else {
                for (int y = m - 1; y >= 0; y--) {
                    a[x][y] = i;
                    i++;
                }
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