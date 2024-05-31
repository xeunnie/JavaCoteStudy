// 소요시간
// [240513] : 20분

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int tc = commands.length;
        int count = 0;
        List<Integer> list = new ArrayList<>();

        while (tc-- > 0) {
            int size = commands[count][1] - commands[count][0] + 1;
            int index = commands[count][2] - 1;
            Integer[] newArr = new Integer[size];

            for (int i = commands[count][0] - 1; i <= commands[count][1] - 1; i++) {
                newArr[i - commands[count][0] + 1] = array[i];
            }
            Arrays.sort(newArr);
            // System.out.println(Arrays.toString(newArr));

            list.add(newArr[index]);
            count++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}