package Number;

public class ContinueOutTest {
    public static void main(String[] args) {
        loop:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            for (int j = 0; j < 5; j++) {
                if (i + j == 8) {
                    continue loop;
                }
                System.out.println(j);
            }
        }
    }
}
