import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(sum_of_digits());
    }

    public static int sum_of_digits() {
        int sum = 0, numb = 0;

        for(int p = 14; p < 100; p+= 7) {
            for (int i = 0; i < Math.log10(p) + 1; i++) {
                numb = (int) ((p % (int) (Math.pow(10, (i + 1))) - numb) / Math.pow(10, i));
                sum += numb;
            }
        }
        return sum;
    }
}