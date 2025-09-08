import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        int arr[] = new int[n];
        arr[0] =  Integer.parseInt(st.nextToken());
        for(int i=1; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
        }    

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(prefixSum(arr, a, b));
        }
    }

    public static int prefixSum(int arr[], int a, int b) {
        if(a==1) return arr[b-1];
        else return arr[b-1]-arr[a-2];
    }
}