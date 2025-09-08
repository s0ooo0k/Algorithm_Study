import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        int arr[]=new int[2];
        fraction(arr, y1, y2);
        int lcm = arr[1];
        int numerator = (x1*(lcm/y1)) + (x2*(lcm/y2));

        fraction(arr, lcm, numerator);
        if(arr[0] != 1) {
            lcm = lcm / arr[0];
            numerator = numerator / arr[0];
        }
        System.out.println(numerator);
        System.out.println(lcm);
    }
    public static int[] fraction(int arr[], int y1, int y2) {
        int mul = y1 * y2; 
        while(y2!=0) {
            int tmp = y1;
            y1 = y2;
            y2 = tmp % y2;
        }
        arr[0]=y1;
        arr[1]=mul/y1;
        return arr;
    }
}