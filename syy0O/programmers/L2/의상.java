import java.util.HashMap;

class Solution {

    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hashmap = new HashMap<>();
        for (int i=0; i<clothes.length;i++) {
            int cnt = hashmap.getOrDefault(clothes[i][1], 0) + 1;
            hashmap.put(clothes[i][1], cnt);
        }

        for (String key : hashmap.keySet()) {
            answer *= (hashmap.get(key) + 1);
        }

        return answer - 1; // 아무것도 안입는 경우의 수 제외

    }
}