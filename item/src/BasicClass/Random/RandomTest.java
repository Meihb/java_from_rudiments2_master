package BasicClass.Random;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rand = new Random();
        //随机布尔值
        System.out.println("rand.nextBoolean():"+rand.nextBoolean());
        System.out.println("rand.nextInt():"+rand.nextInt(25));
    }
}
