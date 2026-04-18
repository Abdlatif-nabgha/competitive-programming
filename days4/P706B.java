package days4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P706B {

     // Use BufferedReader and StringTokenizer for fast I/O instead of Scanner,
    // which is much faster and helps prevent Time Limit Exceeded (TLE) errors.
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
        
        // Read the number of shops
        int n = nextInt();

        // prices of the bottles of the drink in the i-th shop
        int[] x = new int[n];
        
        for (int i = 0; i < n; i++) x[i] = nextInt();
        Arrays.sort(x); // sort the prices for binary search

        // number of days
        int q = nextInt();

        StringBuilder sb = new StringBuilder();
        
        while (q-- > 0) {
            int m = nextInt();
            sb.append(binarySearch(x, m)).append("\n");
        }
        System.out.print(sb);
    }

    // Implement Binary Search in java
    public static int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans + 1;
    }
}