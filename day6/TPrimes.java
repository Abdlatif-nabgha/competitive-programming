package day6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TPrimes {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // Reads the next word/token and parses it as an integer
    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }


    static long nextLong() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return Long.parseLong(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            long x = nextLong();
            long root = (long) Math.sqrt(x);
            if (Math.pow(root, 2) == x && isPrime(root)) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.println(sb);
    }
    private static boolean isPrime(long n) {
        if (n < 2) return false;

        long limit = (long) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
