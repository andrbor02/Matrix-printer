import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n1, n2, i = 0, ans = 0;

        if(a > 0 && b > 0 || a < 0 && b < 0){
            n1 = Math.abs(a);
            n2 = Math.abs(b);

        }
        else {
            if (a > b){
                n1 = a;
                n2 = b;
            }
            else{
                n1 = b;
                n2 = a;
            }

        }
        while(i < n1){
            ans += n2;
            i++;
        }
        System.out.println(ans);
    }
}
