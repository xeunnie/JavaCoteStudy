import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        String[] array;
        int delCnt, insCnt;
        delCnt = 0;
        insCnt = 0;

        // 낮은숫자가 먼저나옴
        PriorityQueue<Integer> pqmin = new PriorityQueue<>();

        // 큰숫자가 먼저나옴
        PriorityQueue<Integer> pqmax = new PriorityQueue<>(Collections.reverseOrder());


        for(int i = 0; i < operations.length; i++) {
            array = operations[i].split(" ");
            // System.out.println(array[0]);
            // System.out.println(array[1]);

            String command = array[0];
            int num = Integer.parseInt(array[1]);

            if(command.equals("I")){
                insCnt++;

                pqmax.add(num);
                pqmin.add(num);
            } else{
                if(insCnt > delCnt) {
                    delCnt++;

                    if(num == 1){
                        int delNum = pqmax.poll();
                        pqmin.remove(delNum);
                    } else {
                        int delNum = pqmin.poll();
                        pqmax.remove(delNum);
                    }
                }
            }
        }

        if(insCnt == delCnt){
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = pqmax.peek();
            answer[1] = pqmin.peek();
        }

        return answer;
    }
}