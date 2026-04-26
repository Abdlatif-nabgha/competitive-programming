package gamewithIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scanner.nextInt();

            if (n % 3 == 0) {
                sb.append("Second").append("\n");
            } else {
                sb.append("First").append("\n");
            }
        }

        System.out.print(sb);
        scanner.close();
    }
}
