import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while(true){
            int a = in.nextInt();
            i++;
            if(a < 0)
                break;
        }
        System.out.println(i);
    }
}