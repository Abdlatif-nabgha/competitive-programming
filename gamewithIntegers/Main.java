package gamewithIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int move = 0;
            while (move < 10 ) {
                if (move % 2 == 0) {
                    if ((n-1)%3 == 0 || (n+1)%3 == 0) {
                         sb.append("First").append("\n");
                         break;
                    }
                    n = n-1;
                }else {
                    n = n+1;
                }
                move++;
            }
            if (move == 10) sb.append("Second").append("\n");
        }

        System.out.print(sb);
        scanner.close();
    }
}
