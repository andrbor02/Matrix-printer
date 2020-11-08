import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, count, remainder = 0, numb = 0;
        int a = in.nextInt();
        count = (int) (Math.log10(a) + 1);
        for(i = 0; i < count; i++){
            numb = (int) ((a % (int)(Math.pow(10, (i + 1))) - numb) / Math.pow(10, i));
            remainder += Math.pow(numb, count);
        }

        if (remainder == a)
            System.out.println("it's Armstrong's number");
        else
            System.out.println("it isn't Armstrong's number");
    }
}