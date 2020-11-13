import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = 0 , t, i = 0;
        char[] ans = new char[100];

        while(X >= 1000) {
            X -= 1000;
            ans[i] = 'M';
            i++;
        }

        if(X / 100 == 9) {
            ans[i] = 'C';
            i++;
            ans[i] = 'M';
            i++;
            X -= 900;
        }
        else{
            while(X >= 500) {
                X -= 500;
                ans[i] = 'D';
                i++;
            }
        }
        if(X / 100 == 4) {
            ans[i] = 'C';
            i++;
            ans[i] = 'D';
            i++;
            X -= 400;
        }
        while(X >= 100) {
            X -= 100;
            ans[i] = 'C';
            i++;
        }

        if(X / 10 == 9) {
            ans[i] = 'X';
            i++;
            ans[i] = 'C';
            i++;
            X -= 90;
        }
        else{
            while(X >= 50) {
                X -= 50;
                ans[i] = 'L';
                i++;
            }
        }

        if(X / 10 == 4) {
            ans[i] = 'X';
            i++;
            ans[i] = 'L';
            i++;
            X -= 40;
        }
        else{
            while(X >= 10) {
                X -= 10;
                ans[i] = 'X';
                i++;
            }
        }

        if(X == 9) {
            ans[i] = 'I';
            i++;
            ans[i] = 'X';
            i++;
            X -= 9;
        }
        else{
            while(X >= 5) {
                X -= 5;
                ans[i] = 'V';
                i++;
            }
        }
        if(X == 4) {
            ans[i] = 'I';
            i++;
            ans[i] = 'V';
            i++;
            X -= 9;
        }
        else{
            while(X >= 1) {
                X -= 1;
                ans[i] = 'I';
                i++;
            }
        }

        for(int g = 0; g < i; g++)
            System.out.print(ans[g]);
    }
}
//        while(Y < X){
//        if(X % 100 > 0) {
//        t = X / 100;
//        Y += t * 100;
//        ans[i] = 'C';
//        }
//        else if(X % 50 > 0) {
//        t = X / 100;
//        Y += t * 100;
//        ans[i] = 'L';
//        }
//        else if(X % 10 > 0){
//        t = X / 100;
//        Y += t  * 100;
//        ans[i] = 'X';
//        }
//        else if(X % 5 > 0){
//        t = X / 100;
//        Y += t  * 100;
//        ans[i] = 'V';
//        }
//        else if(X % 1 > 0) {
//        t = X / 100;
//        Y += t * 100;
//        ans[i] = 'I';
//        }