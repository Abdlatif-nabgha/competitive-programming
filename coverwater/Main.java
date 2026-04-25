package coverwater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int minCost = 0;
            int len = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    len++;
                } else {
                    if (len == 1) minCost += 1;
                    if (len == 2) minCost += 2;
                    if (len >= 3) {
                        minCost = 2;
                        break;
                    }
                    len = 0;
                }
            }

            if (len == 1) minCost += 1;
            if (len == 2) minCost += 2;
            if (len >= 3) minCost = 2;

            sb.append(minCost).append("\n");
        }

        System.out.print(sb);
        scanner.close();
    }
}
