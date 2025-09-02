import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            System.out.println(com(a, b));
        }
    }
    public static int com(int a, int b) {
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=1; i<5; i++) {
            int remain = (int) (Math.pow(a, i)) % 10;
            if(!map.containsValue(remain)) {
                map.put(i, remain);
            }
        }
        int last = b % map.size();
        if(last==0) last = map.size();
        if(map.get(last)==0) return 10;
        
        return map.get(last);
    }
}