package xeunnie.Programmers.L1;

class 서울에서김서방찾기 {
    public static String solution(String[] seoul) {
        int index = -1;
        
        // 배열을 순회하며 "Kim"의 위치를 찾습니다.
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}
    
