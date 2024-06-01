//소요시간
//[240521] : 20분

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> hm = new HashMap<>();

        for(int i=0; i<clothes.length; i++){
            String type = clothes[i][1];
            hm.put(type,hm.getOrDefault(type,1)+1);
        }

        for(String x : hm.keySet()){
            answer *= hm.get(x);
        }

        return answer-1;
    }
}