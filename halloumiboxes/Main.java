package halloumiboxes;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        
        StringBuilder sb = new StringBuilder();

        st.nextToken();
        int t = (int) st.nval;

        while (t-- > 0) {
            st.nextToken(); int n = (int) st.nval;
            st.nextToken(); int k = (int) st.nval;

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                a[i] = (int) st.nval;
            }

            if (k >= 2) {
                sb.append("YES\n");
                continue;
            }

            boolean sorted = true;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i-1]) { sorted = false; break; }
            }
            sb.append(sorted ? "YES\n" : "NO\n");
        }

        System.out.print(sb);
    }
}