import java.util.*;
class Solution {

  public long solution(int n) {
    long [] dp = new long[n+2];
    dp[0]=0;
    dp[1]=1;
    dp[2]=2;

    for(int i=3;i<=n;i++){
      dp[i]=(dp[i-1]+dp[i-2])%1234567;
    }
    long answer=dp[n];
    return answer;
  }
}