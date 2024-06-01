/* 알고리즘 */
// 1안 ) answer = n 부터 1까지 1씩 감소하는 for 반복문을 사용해 최솟값을 구한다.
// 2안 ) answer = 1부터 시작해서 나머지가 1이 되는 수가 나타날 때까지 반복문으로 통해 증가시킨다. 조건을 만족시킨 수가 나올 시 반복문을 종료한다.

// => 1안보다 2안의 코드가 검사 횟수가 더 적어, 성능적으로 더 좋다.

class Solution {
    public int solution(int n) {
        int answer = 1;
        while(true){
            if(n%answer==1) {
                break;
            }
            answer++;
        }
        return answer;
    }
}