
class Solution {
    public long solution(long n) {
        int x = (int)Math.sqrt(n);
        if (n == (long)x*x){
            return (long)(x+1)*(x+1);
        } else return -1;
    }
}