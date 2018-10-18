package ObjectOrientation;

class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (Singleton.instance != null) {
        } else {
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }
}

public class SingletonTest {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }


}
