import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[][] work  = new double[N][2];

        int s, t;
        StringTokenizer st;
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            t = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            work[i][0] = i + 1;
            work[i][1] = (double) t / s;
        }

        Arrays.sort(work, (a, b) -> Double.compare(a[1], b[1]));

        for(int i=0; i<N; i++) {
            System.out.print((int) work[i][0]+" ");
        }
    }
}