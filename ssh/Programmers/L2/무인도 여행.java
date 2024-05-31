import java.util.*;


class Solution {
    static int W, H, sum;
    static boolean[][] visited;
    static char[][] island;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public int[] solution(String[] maps) {
        W = maps.length;
        H = maps[0].length();
        visited = new boolean[W+1][H+1];
        island = new char[W+1][H+1];
        ArrayList<Integer> answer = new ArrayList<>();

        // island 값 입력
        for(int i = 0; i < W; i++){
            for(int j = 0; j < H; j++){
                island[i][j] = maps[i].charAt(j);
            }
        }

        for(int i = 0; i < W; i++){
            for(int j = 0; j < H; j++){
                if(island[i][j] != 'X' && visited[i][j] == false) {
                    sum = 0;
                    bfs(i, j);
                    if(sum != 0) {
                        answer.add(sum);
                    }
                }
            }
        }

        if(answer.size() == 0) {
            answer.add(-1);
        }

        Collections.sort(answer);

        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i);
        }


        return result;
    }

    public static int bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x, y));
        visited[x][y] = true;
        sum += island[x][y] - '0';

        while(!q.isEmpty()){
            Point now = q.poll();
            // 4방향 탐색 시작
            for(int i = 0; i < 4; i++) {
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if(nr < 0 || nr >= W || nc < 0 || nc >= H) continue;
                if(visited[nr][nc] == false && island[nr][nc] != 'X'){
                    visited[nr][nc] = true;
                    q.add(new Point(nr, nc));
                    // 0을 빼주는 이유 : 0을 빼주는 연산으로 인해 Integer로 바꿀 수 있음
                    sum += island[nr][nc] - '0';
                }
            }
        }

        return sum;
    }
}

class Point{
    int r, c;

    Point(int r, int c) {
        this.r = r;
        this.c = c;
    }
}