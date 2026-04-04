package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
        int t = nextInt();

        while (t-- > 0) {
            int a = nextInt();
            int b = nextInt();
            int c = nextInt();

        
        }
    }
}
