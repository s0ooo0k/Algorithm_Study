import java.io.*;
import java.util.*; 

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int[][] dp = new int[a.length()+1][b.length()+1];

        for(int i=0; i<a.length(); i++) {
            for(int j=0; j<b.length(); j++) {
                if(a.charAt(i)==b.charAt(j)) {
                    dp[i+1][j+1]=dp[i][j]+1;
                }
                else {
                    dp[i+1][j+1]=Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        System.out.println(dp[a.length()][b.length()]); 

        Stack<Character> s = new Stack<>();
        int x = a.length();
        int y = b.length();

        while(x>0 && y>0) {
            if(a.charAt(x-1) == b.charAt(y-1)) {
                s.push(a.charAt(x-1));
                x--;
                y--;
            }
            else {
                if(dp[x-1][y] >= dp[x][y-1]) {
                    x--;
                }
                else y--;
            }
        }
        while(!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
}

