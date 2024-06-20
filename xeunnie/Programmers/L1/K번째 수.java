package xeunnie.Programmers.L1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            List<Integer> slicedArray = new ArrayList<>();
            for (int j = start; j < end; j++) {
                slicedArray.add(array[j]);
            }
            Collections.sort(slicedArray);
            answer[i] = slicedArray.get(k);
        }

        return answer;
    }
}