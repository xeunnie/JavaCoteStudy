import java.util.*;

class 나누어_떨어지는_숫자_배열 {
  public int[] setSize(int []array,int size) {
    array = Arrays.copyOf(array,size);
    return array;
  }

  public int[] solution(int[] arr, int divisor) {
    int length=arr.length,idx=0;
    int [] answer=new int [length];

    for(int num : arr){
      if(num%divisor==0) {
        answer[idx]=num;
        idx++;
      }
    }

    if (idx==0) {
      answer[0]=-1;
      answer=setSize(answer,1);
      return answer;
    }

    answer=setSize(answer,idx);
    Arrays.sort(answer);
    return answer;
  }
}