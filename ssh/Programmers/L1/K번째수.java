import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // i번째 ~ j번째
        // idx대로 연산하면 안되고 정말 말 그대로 접근해야 한다.
        // 1. 범위대로 배열값 뽑아내기
        // 2. Arrays.sort로 정렬
        // 3. k 번째 숫자 출력

        //2~5 -> idx : 1~4
        //4~4 -> idx : 3~3
        //1~7 -> idx : 0~6

        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int startIdx = commands[i][0];
            int endIdx = commands[i][1];
            int[] reArray = new int[endIdx - startIdx + 1];
            int idx = startIdx;

            for(int j = 0; j < endIdx-startIdx+1; j++){
                reArray[j] = array[idx-1];
                idx ++;
            }
            Arrays.sort(reArray);

            answer[i] = reArray[commands[i][2]-1];
        }

        return answer;
    }
}