import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int dp[] = new int[n+1];
        Arrays.fill(dp, 1000000);

        if(n>=3) dp[3]=1;
        if(n>=5) dp[5]=1;
        
        for(int i=6; i<=n; i++) {
            if(dp[i-3]<1000000) {
                dp[i]=Math.min(dp[i], dp[i-3]+1);
            }
            if(dp[i-5]<1000000) {
                dp[i]=Math.min(dp[i], dp[i-5]+1);
            }
        }
        if(dp[n]==1000000) System.out.println("-1");
        else System.out.println(dp[n]);
    }
}