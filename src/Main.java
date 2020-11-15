import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        boolean flag = true;

        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();

        int numb = in.nextInt();

        for(int y = 0; y < n; y++) {
            if (a[y] == numb) {
                System.out.println(y + 1);
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("NO");

    }
}
