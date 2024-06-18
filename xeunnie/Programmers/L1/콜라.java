

public class 콜라 {
    public static int solution(int a, int b, int n) {
        int total_colas = 0;

        while (n >= a) {
            int new_colas = (n / a) * b;
            total_colas += new_colas;
            n = (n % a) + new_colas;
        }
        return total_colas;
    }
}
