package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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

        int[] arr = new int[t];

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            arr[i] = nextInt();
        }

        
        Arrays.sort(arr);

        for (int x : arr) {
            sb.append(x).append(" ");
        }
        System.out.println(sb);

    }
}