package halloumiboxes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();

            for (int test = 0; test < t; test++) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                boolean canSort = (k >= 2);
                if (k == 1) {
                    canSort = true;
                    for (int i = 0; i < n - 1; i++) {
                        if (a[i] > a[i + 1]) {
                            canSort = false;
                            break;
                        }
                    }
                }
                System.out.println(canSort ? "YES" : "NO");
            }
        }
    }
}