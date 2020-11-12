import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a > 12 || a <= 0)
            System.out.println("0");
        else{
        switch (a) {
            case 2:
                System.out.println("28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("31");
        }
        }
    }
}