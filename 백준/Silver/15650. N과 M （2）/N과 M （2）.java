import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int m;
    static int n;
    static boolean visited[];
    static int arr[];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        arr = new int[m+1];
        
        bt(1);
    }

    public static void bt(int depth) {
        if(depth>m) {
            for(int i=1; i<=m; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
            return ;
        }
        for(int i=1; i<=n; i++) {
            if(!visited[i] && i>arr[depth-1]) {
                arr[depth]=i;
                bt(depth+1);
                visited[i]=false;
            }
        }      
        
    }
}