import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int ans = sum(st.nextToken());

        while(st.hasMoreTokens()) {
            ans -= sum(st.nextToken());
        }
        System.out.println(ans);
    }
    static int sum(String s) {
        int sum = 0;
        for(String n : s.split("\\+")) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}