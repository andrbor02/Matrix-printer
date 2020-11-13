import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int i = 0, numb1 = 0, numb2 = 0;
        boolean flag = false;

        while(i < Math.log10(A) - 1){
            numb1 = (int) ((A % (int)(Math.pow(10, (i + 1))) - numb1) / Math.pow(10, i));
            numb2 = (int) ((A % (int)(Math.pow(10, (i + 2))) - numb2) / Math.pow(10, i + 1));
            if(numb1 == numb2)
                flag = true;
            i++;
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
