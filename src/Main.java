import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        boolean flag = true;

        int[][] a = new int[N][N];

        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                a[x][y] = in.nextInt();
            }
        }

        for(int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (x > y)
                    if(a[x][y] != a[y][x])
                        flag = false;
                if (x < y)
                    if(a[x][y] != a[y][x])
                        flag = true;
            }
        }
        if(flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}