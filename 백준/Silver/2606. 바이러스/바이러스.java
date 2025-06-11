import java.util.*;

public class Main {
    static boolean[] visited;
    static List<List<Integer>> graph = new ArrayList<>();
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = sc.nextInt();
        int pair = sc.nextInt();

        for (int i = 0; i <= computer; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < pair; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);  
        }

        // 방문
        visited = new boolean[computer + 1];
        dfs(1);  

        System.out.println(count - 1);  
    }

    public static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}
