import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] line = new int[n][2];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            line[i][0] = Integer.parseInt(st.nextToken());
            line[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(line, (a, b) -> a[0] - b[0]);

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = line[i][1];
        }

        System.out.println(n-LIS(arr));
    }

    public static int LIS(int[] port) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int p : port) {
            int idx = lowerBound(list, p);
            
            if(idx == list.size()) {
                list.add(p);
            } else {
                list.set(idx, p);
            }
        }
         return list.size();
    }

    public static int lowerBound(ArrayList<Integer> list, int target) {
        int left = 0; 
        int right = list.size();

        while(left<right) {
            int mid = (left+right)/2;
            if(list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}