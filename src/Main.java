import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number_of_bridges = in.nextInt();

        int i = 1;
        while(i < N){
            t = in.nextInt();
            if (t <= 437){
                out.println("Crash " + i);
                break;
            }
            i++;
        }
        if (t > 437){
            out.println("No сrash");
        }
    }
}
