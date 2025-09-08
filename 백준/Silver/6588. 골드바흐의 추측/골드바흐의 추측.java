import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean arr[] = new boolean[1000001];

        arr[0]=arr[1]=true;
        for(int i=2; i*i<=1000000; i++){
            if(!arr[i]) {
                for(int j=i*i; j<=1000000; j+=i) 
                   arr[j]=true; 
            }
        }
        
        int n = Integer.parseInt(st.nextToken());
        int a = 0;
        int b = 0;
        
        while(n!=0){
            for(int i=n; i>0; i--) {
                if(arr[i]==false) {
                    b = i;
                    a = n - b;
                    if(arr[a]==false) {
                        System.out.println(n +" = "+ a +" + "+b);
                        break;
                    }
                }
            }
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
        }
    }
}