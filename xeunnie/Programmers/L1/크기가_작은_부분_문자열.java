package xeunnie.Programmers.L1;

public class 크기가_작은_부분_문자열 {
    public static int solution(String t, String p) {
        int pLength = p.length();
        int pValue = Integer.parseInt(p);
        int count = 0;

        for (int i = 0; i <= t.length() - pLength; i++) {
            String substring = t.substring(i, i + pLength);
            if (Integer.parseInt(substring) <= pValue) {
                count++;
            }
        }

        return count;
    }
}
