package day6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A160 {
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
        int totalSum = 0;
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = nextInt();
            totalSum += A[i];
        }
        Arrays.sort(A);
        int mySum = 0;
        int count = 0;
        int i = n-1;
        while (mySum <= totalSum / 2) {
            mySum += A[i];
            i--;
            count++;
        }
        System.out.print(count);
    }
}
