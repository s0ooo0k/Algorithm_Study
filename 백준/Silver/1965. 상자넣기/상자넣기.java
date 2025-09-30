import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int answer = LIS(num);
        System.out.println(answer);
    }

    public static int LIS(int[] num) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int n : num) {
            int idx = Collections.binarySearch(list, n);

            if(idx < 0) {
                idx = -(idx+1);
            }

            if(idx == list.size()){
                list.add(n);
            } else {
                list.set(idx, n);
            }
        }
        return list.size();
    }
}
