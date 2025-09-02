import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str = br.readLine();
        Integer n = Integer.parseInt(str);
        Integer k = str.length();
       
        System.out.println(number(n, k));
    }
    public static int number(int n, int k) {
        int sum = 0;
        for(int i=1; i<=k-1; i++) {
            sum += 9 * Math.pow(10, i-1) * i;
        }
        sum += (n - Math.pow(10, k-1) + 1) * k;
        return sum;
    }
}