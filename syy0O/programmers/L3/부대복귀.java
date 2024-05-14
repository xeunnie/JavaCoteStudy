import java.util.*;

class Solution {
    private static int[] dist; 
    private static ArrayList<Integer>[] edges; // 경로 저장

    public int[] solution(int n, int[][] roads, int[] sources, int destination)     {

        edges = new ArrayList[n+1];
        for (int i=0;i<=n;i++) {
            edges[i] = new ArrayList<>();
        }

        for (int i=0;i<roads.length;i++) {
            edges[roads[i][0]].add(roads[i][1]);
            edges[roads[i][1]].add(roads[i][0]);
        }

        bfs(n, destination);

        int[] answer = new int[sources.length];
        for (int i=0; i < sources.length; i++) {
            answer[i] = dist[sources[i]];
        }

        return answer;
    }

    public static void bfs(int n, int dest) {

        // 거리 초기화
        dist = new int[n+1];
        Arrays.fill(dist, -1);
        dist[dest] = 0;

        // 방문 초기화
        boolean[] visited = new boolean[n+1];
        visited[dest] = true;

        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(dest);

        while(!queue.isEmpty()) {
            int now = queue.pollFirst();
            
            for (int next : edges[now]) {
                if (!visited[next]){
                    visited[next] = true;
                    dist[next] = dist[now] + 1;
                    queue.addLast(next);
                }
            }
        }
    }
}