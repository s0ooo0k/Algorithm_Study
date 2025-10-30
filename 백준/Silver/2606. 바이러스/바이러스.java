import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N, V;
    static ArrayList<ArrayList<Integer>> g = new ArrayList<>();
    static boolean[] visited;
    static int cnt=0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        V = Integer.parseInt(br.readLine());

        visited = new boolean[N+1];

        // 그래프 만들기
        for (int i=0; i<=N; i++) {
            g.add(new ArrayList<>());
        }
        
        for(int i=0; i<V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            g.get(u).add(v);
            g.get(v).add(u);
        }

        dfs(1);
        System.out.println(cnt-1);
    }

    public static void dfs(int node) {
        visited[node] = true;
        cnt++;

        for(int n : g.get(node)) {
            if(!visited[n]) {
                dfs(n);
            }
        }
    }
}