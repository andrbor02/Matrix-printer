import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int i = 0, numb = 0, flag = 1;
        while(i < Math.log10(A) + 1){
            numb = (int) ((A % (int)(Math.pow(10, (i + 1))) - numb) / Math.pow(10, i));
            if(numb % 2 == 1) {
                System.out.println(numb);
                flag = 0;
                break;
            }
            i++;
        }
        if(flag == 1)
        System.out.println("NO");
    }
}