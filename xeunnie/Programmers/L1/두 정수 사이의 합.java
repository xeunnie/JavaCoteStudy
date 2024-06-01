package xeunnie;

class Solution {
    public long solution(int a, int b) {
        int smallNum = Math.min(a, b);
        int bigNum = Math.max(a, b);
        long num = smallNum;

        if (a != b) {
            for (int i = smallNum + 1; i <= bigNum; i++) {
                num += i;
            }
        }
        return num;
    }
}