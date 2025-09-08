import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        prime(n, m);
    }
    
    public static void prime(int n, int m){
        boolean arr[] = new boolean[m+1];

        arr[0]=arr[1]=true;

        for(int i=2; i*i<=m; i++){
            if(!arr[i]) {
                for(int j=i*i; j<=m; j+=i) 
                   arr[j]=true; 
            }
        }

        for(int i=n; i<=m; i++) {
            if(!arr[i])
                System.out.println(i);
        }
    }
}