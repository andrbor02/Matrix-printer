import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int t = 1;

        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                a[x][y] = t;
                b[y][x] = t;
                t++;
            }
        }

//        for(int x = 0; x < n; x++){
//            for(int y = 0; y < n; y++){
//                System.out.printf("%3d",a[x][y]);
//            }
//            System.out.print("\n");
//        }
//        for(int x = 0; x < n; x++){
//            for(int y = 0; y < n; y++){
//                System.out.printf("%3d",b[x][y]);
//            }
//            System.out.print("\n");
//        }

        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){
                if(a[x][y] == b[x][y])
                    System.out.print(a[x][y] + " ");
            }
        }

    }
}