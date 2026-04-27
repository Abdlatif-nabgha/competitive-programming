import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }    

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        int t = nextInt();

        while (t-- > 0) {

            int a = nextInt();
            int b = nextInt();
            int c = nextInt();

            if (a == b + c || b == a + c || c == a + b) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.print(sb);
    }
}