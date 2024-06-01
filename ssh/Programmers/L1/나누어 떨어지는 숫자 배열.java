import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1
        ArrayList<Integer> arrayAns = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                arrayAns.add(arr[i]);
            }
        }

        if(arrayAns.size() == 0) {
            arrayAns.add(-1);
        }

        // ArrayList to 배열
        int[] answer = new int[arrayAns.size()];
        for (int i = 0; i < arrayAns.size(); i++) {
            answer[i] = arrayAns.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
