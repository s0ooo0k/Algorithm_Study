import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        uclid(n, m);
    }
    public static void uclid(int n, int m) {
        int mul = n * m; 
        while(m!=0) {
            int tmp = n;
            n = m;
            m = tmp % m;
        }
        System.out.println(n);
        System.out.println(mul/n);
    }
}