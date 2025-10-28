import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    private static boolean[] visited;
    private static int N, M;
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); 
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        int cnt = 0;

        // 그래프 만들기
        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 점 순회
        for(int i=1; i<=N; i++) {
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int node){
        visited[node] = true;

        for(int next : graph.get(node)) {
            if(!visited[next]) 
                dfs(next);
        }
    }
}