import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int i = 0, numb = 0, sum = 0;
        while(i < Math.log10(A)){
            numb = (int) ((A % (int)(Math.pow(10, (i + 1))) - numb) / Math.pow(10, i));
            sum += numb;
            i++;
        }
        System.out.println(sum);
    }
}
