import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] cards = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            cards[i]=Integer.parseInt(st.nextToken());
        }

        int sub = 100000;
        int add = 0;
        int answer = 0;

        // 구하기
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++){
                    add = cards[i]+cards[j]+cards[k];
                    if(sub>(m-add) && add<=m) {
                        sub = m-add;
                        answer = add;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}