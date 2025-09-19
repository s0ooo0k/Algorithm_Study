import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] card = new int[10001];
        int[] dp = new int[1001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            card[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<=n; i++) {
            for(int j=0; j<=i; j++) {
                dp[i]=Math.max(dp[i], dp[j]+card[i-j]);
            }
        }
        System.out.println(dp[n]);
    }
}