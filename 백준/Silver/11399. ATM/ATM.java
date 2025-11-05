import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] p = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(p);

        int[] dp = new int[N];
        dp[0] = p[0];

        for(int i=1; i<N; i++) {
            dp[i] = dp[i-1]+p[i];
        }

        int sum = 0;
        for(int d : dp) {
            sum += d;
        }
        System.out.println(sum);
    }
}