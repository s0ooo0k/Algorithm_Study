import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int x = (int) Math.sqrt(m);
        int y = (int) Math.sqrt(n);

        int sum = powSum(y) - powSum(x);

        if(x*x==m) {
            sum = powSum(y) - powSum(x-1);
            System.out.println(sum);
            System.out.println(m);
        }
        else if (sum <= 0) System.out.println("-1");
        else {
            System.out.println(sum);
            System.out.println((x+1)*(x+1));
        }
    }
    public static int powSum(int x) {
        return x * (x+1) * (2*x+1) / 6;
    }
}