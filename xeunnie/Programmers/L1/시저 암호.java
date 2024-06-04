package xeunnie.Programmers.L1;

class Solution {
    public String solution(String s, int n) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) {
                int index = c - 'A';
                int newIndex = (index + n) % 26;
                result.append(alphabet[newIndex]);
            }
            else if (Character.isLowerCase(c)) {
                int index = c - 'a';
                int newIndex = (index + n) % 26;
                result.append(alphabet[newIndex].toLowerCase());
            }
            else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
