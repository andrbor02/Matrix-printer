import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int copy_N = N;
        if((N - (N % 10)) / 10 % 10 != 1)
            copy_N = N % 10;
        else
            copy_N = N % 100;

        switch (copy_N){
            case 1:
                System.out.println(N + " TOPT");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(N + " TOPTA");
                break;
            default:
                System.out.println(N + " TOPTOB");
        }
    }
}