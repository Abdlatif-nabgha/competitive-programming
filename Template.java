import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Template {
    
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

    // Reads the next word/token and parses it as a long.
    // Useful for very large numbers that exceed the 32-bit int limit (~2.14 billion).
    static long nextLong() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return Long.parseLong(st.nextToken());
    }

    // Reads the next continuous word/token as a String (stops at spaces or newlines)
    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    // Reads the rest of the current line as a String, including spaces
    static String nextLine() throws IOException {
        return br.readLine();
    }
    
    public static void main(String[] args) throws IOException {
        
        // Use StringBuilder to buffer all outputs and print them at once at the end.
        // Calling System.out.println() multiple times is very slow in Java.
        StringBuilder sb = new StringBuilder();
        
        // Read the number of test cases
        int t = nextInt();
        
        // Loop 't' times, processing each test case
        while (t-- > 0) {
            
            // Read 'n', which usually represents the number of elements
            int n = nextInt();
            
            // Use 'long' to accumulate the sum to prevent potential integer overflow
            // if the sum of numbers exceeds Integer.MAX_VALUE
            long sum = 0; 

            // Loop 'n' times to read 'n' numbers from the input
            for (int i = 0; i < n; i++) {
                // Add the current number to sum on-the-fly without needing to save it to an array
                sum += nextLong();
            }

            // Append the result for this testcase to the StringBuilder, followed by a newline
            sb.append(sum).append("\n");
        }
        
        // Print the accumulated result exactly once at the very end
        System.out.print(sb);
    }   

    // Implement Binary Search in java
    public static int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) return mid + 1; // +1 because we want to return the number of elements
            else if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }

        return l;
    }
}