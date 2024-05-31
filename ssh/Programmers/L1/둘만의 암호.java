import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            int cnt = 0;
            char word = s.charAt(i);
            while(index > cnt){
                char calWord = (char)(word+1);
                if(calWord > 'z') calWord = 'a';

                if(skip.contains(Character.toString(calWord))) {
                    word = calWord;
                    continue;
                } else {
                    cnt ++;
                    word = calWord;
                }
            }
            answer += word;
        }

        return answer;
    }
}