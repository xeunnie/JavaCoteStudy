package xeunnie.Programmers.L1;

class Solution {
    public String solution(String s) {
        if (s.isEmpty()) {
            return "0 0";
        } // 만약 비어있다면 "0 0"을 반환해야한다.

        String[] strArr = s.split(" ");
        int[] nums = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            nums[i] = Integer.parseInt(strArr[i]);
        }
        // s를 공백 문자를 기준으로 먼저 분리한다. 이후 strArr 배열에 저장한다.

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return min + " " + max;
    }
}