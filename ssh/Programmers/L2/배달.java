class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int inf = 1000000000;

        // 행렬 reset
        int[][] graph = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) graph[i][j] = 0;
                else graph[i][j] = inf;
            }
        }

        for (int[] r : road) {
            int a = r[0];
            int b = r[1];
            int c = r[2];

            // 중복일때 최소값 설정을 위해 min 활용
            graph[a][b] = Math.min(graph[a][b], c);
            graph[b][a] = Math.min(graph[b][a], c);
        }

//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                System.out.print(graph[i][j] + " ");
//            }
//            System.out.println();
//        }

        // 플로이드-워셜
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    graph[j][k] = Math.min(graph[j][k], graph[j][i] + graph[i][k]);
                }
            }
        }

        // K보다 작은값들 cnt --> answer++
        for (int i = 1; i <= N; i++) {
            if (graph[1][i] <= K) answer++;
        }

        return answer;
    }
}