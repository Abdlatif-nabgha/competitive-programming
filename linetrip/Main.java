package linetrip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int maxTank = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    maxTank = Math.max(maxTank, a[i]);
                }
                else {
                    maxTank = Math.max(maxTank, a[i] - a[i-1]);
                }
            }

            maxTank = Math.max(maxTank, (x - a[n-1]) * 2);
            sb.append(maxTank).append("\n");
        }

        System.out.print(sb);
        scanner.close();
    }
}
