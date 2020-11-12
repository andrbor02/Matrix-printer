import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int past = 0;

        if (month > 12 || month < 1 || day > 31 || day < 1 || (month == 2 && day > 28) || ((month == 4 || month == 6 || month == 9 || month == 11) & day > 30))
            System.out.println("-1");
        else{
            for (int i = 1; i < month; i++) {
                switch (i) {
                    case 2:
                        past += 28;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        past += 30;
                        break;
                    default:
                        past += 31;
                        break;
                }
            }
            past += day;
            System.out.println(365 - past);
        }
    }
}