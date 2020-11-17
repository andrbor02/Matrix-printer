import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(sum_of_digits(n));
    }

    public static int sum_of_digits(int a) {
        int sum = 0, numb = 0;

        for (int i = 0; i < Math.log10(a) + 1; i++) {
            numb = (int) ((a % (int) (Math.pow(10, (i + 1))) - numb) / Math.pow(10, i));
            sum += numb;
        }
        return sum;
    }
}