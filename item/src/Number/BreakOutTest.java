package Number;

public class BreakOutTest {
    public static void main(String[] args) {
        Loop1:
        for (int i = 0; i <= 10; i += 1) {
            System.out.println(i);
            for (int j = 0; j <= 4; j += 1) {
                System.out.println(j);
                int sum = i + j;
                if (sum == 7) {
                    break Loop1;
                } else if (sum == 8) {
                    break;
                }
            }
        }
    }
}
