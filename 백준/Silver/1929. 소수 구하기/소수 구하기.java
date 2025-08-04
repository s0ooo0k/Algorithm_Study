import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m= sc.nextInt();

        isPrime(n, m);
        sc.close();
    }

    public static void isPrime(int n, int m) {
        boolean[] arr = new boolean[m+1];
        Arrays.fill(arr, true);
        arr[0]=arr[1]=false;

        for(int i=2; i<=Math.sqrt(m); i++) {
            if(arr[i]) {
                for(int j=i*i; j<=m; j+=i) {
                    arr[j]=false;
                }
            }
        }
        for(int i=n; i<=m; i++) {
            if(arr[i])
                System.out.println(i);
        }
    }
}