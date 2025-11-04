import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int S = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N && S > 0; i++) {
            int maxIdx = i;
            int maxValue = arr[i];
            
            for (int j = i + 1; j < N && j <= i + S; j++) {
                if (arr[j] > maxValue) {
                    maxValue = arr[j];
                    maxIdx = j;
                }
            }
            
            while (maxIdx > i) {
                int temp = arr[maxIdx];
                arr[maxIdx] = arr[maxIdx - 1];
                arr[maxIdx - 1] = temp;
                maxIdx--;
                S--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}