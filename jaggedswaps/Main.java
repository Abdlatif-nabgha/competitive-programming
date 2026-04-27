package jaggedswaps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] A = new int[n];
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }
            // check if the array already sorted 
            boolean sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (A[i] > A[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                sb.append("Yes").append("\n");
            }
            else {
                for (int i = 2; i < n-1; i++) {
                    if (A[i] > A[i-1] && A[i] > A[i+1]) {
                        int temp = A[i];
                        A[i] = A[i+1];
                        A[i+1] = temp;
                    }
                }
                //check if the array is sorted
                for (int i = 0; i < n - 1; i++) {
                    if (A[i] > A[i + 1]) {
                        possible = false;
                        break;
                    }
                }
                if (possible) {
                    sb.append("Yes").append("\n");
                }
                else {
                    sb.append("No").append("\n");
                }
            }
        }
        System.out.print(sb);
        scanner.close();
    }
}
