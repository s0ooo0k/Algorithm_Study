import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static ArrayList<Integer>[] g;
    static boolean[] visit;
    static int n, m, v;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 그래프
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        g = new ArrayList[n+1];
        for(int i=1; i<=n; i++) {
            g[i]=new ArrayList<>();
        }

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            g[a].add(b);
            g[b].add(a);
        }

        for(int i=1; i<=n; i++) {
            Collections.sort(g[i]);
        }

        visit = new boolean[n+1];
        dfs(v);
        System.out.println();

        visit = new boolean[n+1];
        bfs(v);
    }

    public static void dfs(int node) {
        visit[node] = true;
        System.out.print(node+ " ");
        for(int n : g[node]) {
            if(!visit[n]) {
                dfs(n);
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visit[start] = true;
        q.offer(start);

        while(!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node+ " ");
            for(int n : g[node]) {
                if(!visit[n]) {
                    visit[n]=true;
                    q.offer(n);
                }
            }
        }
    }
}