import java.util.Arrays;

class K번째수 {

  public int[] solution(int[] array, int[][] commands) {

    int[] answer = new int[commands.length];

    for(int i=0;i<commands.length;i++){

      int[] cutarr=cutArray(array,commands[i][0],commands[i][1]);

      Arrays.sort(cutarr);

      answer[i]=cutarr[commands[i][2]-1];

    }

    return answer;

  }

  public int[] cutArray(int[] arr,int start,int end){

    int[] cutarr=new int[end-start+1];

    for (int i = 0; i < cutarr.length; i++) {

      cutarr[i] = arr[start - 1 + i];

    }

    return cutarr;

  }




}