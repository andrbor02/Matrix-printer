import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n - 1; i++)
            a[i] = in.nextInt();

        for(int x = 0; x < n - 1; x++){
            for(int y = 0; y < n - 2; y++){
                if(a[y + 1] < a[y]){
                    int b = a[y];
                    a[y] = a[y + 1];
                    a[y + 1] = b;
                }

            }
        }

        for(int t = 0; t < n; t++){
            if(a[t] != t + 1) {
                System.out.print(t + 1);
                break;
            }
        }
    }
}