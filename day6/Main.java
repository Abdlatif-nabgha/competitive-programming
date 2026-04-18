package day6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // Reads the next word/token and parses it as an integer
    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {

        int n = nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = nextInt();
        }

        int m = nextInt();
        int[] B = new int[m];

        for (int i = 0; i < m; i++) {
            B[i] = nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0, j = 0, count = 0;

        while (i < n && j < m) {
            if (Math.abs(A[i]-B[j]) <= 1) {
                i++;
                j++;
                count++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.print(count);
    }
}
