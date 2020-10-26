import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int numb = 0;
        int ans = 9;
        int i = 0;
        int c4et = (int)Math.log10(N)+1;
        while(c4et > 0) {
            numb = (int) ((N % Math.pow(10, i + 1) - numb) / Math.pow(10, i));
            if(numb < ans)
                ans = numb;
            i++;
            c4et--;
        }
        System.out.println(ans);
    }
}
