import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] map = new int[n+1][m+1];

        for(int i=1; i<=n; i++) {
            String[] row = br.readLine().split(" ");
            for(int j=1; j<=m; j++) {
                map[i][j] = Integer.parseInt(row[j-1]);
            }
        }

        int k = Integer.parseInt(br.readLine());
        for(int i=0; i<k; i++) {
            String[] data = br.readLine().split(" ");
            System.out.println(answer(map, data));
        }
    }
    public static int answer(int[][] map, String[] data) {
        int i = Integer.parseInt(data[0]);
        int j = Integer.parseInt(data[1]);
        int x = Integer.parseInt(data[2]);
        int y = Integer.parseInt(data[3]);

        int sum = 0;

        for(int row=i; row<=x; row++) {
            for(int col=j; col<=y; col++) {
                sum += map[row][col];
            }
        }

        return sum;
    }
}
