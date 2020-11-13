import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number_of_bridges = in.nextInt();
        int t = 0, i = 1;
        
        while(i <= number_of_bridges){
            t = in.nextInt();
            if (t <= 437){
                System.out.println("Crash " + i);
                break;
            }
            i++;
        }
        if (t > 437){
            System.out.println("No crash");
        }
    }
}
