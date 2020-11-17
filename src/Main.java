import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();

        System.out.println(sum_of_digits(X));
    }

    public static int sum_of_digits(int X) {
        int sum_all = 0, numb = 0, sum = 0;

        for(int p = 100; p < X; p++) {
            sum = 0;
            numb = 0;
            for (int i = 0; i < Math.log10(p) + 1; i++) {
                numb = (int) ((p % (int) (Math.pow(10, (i + 1))) - numb) / Math.pow(10, i));
                sum += numb;
            }
            if(sum % 13 == 0)
                sum_all++;
        }
        return sum_all;
    }
}