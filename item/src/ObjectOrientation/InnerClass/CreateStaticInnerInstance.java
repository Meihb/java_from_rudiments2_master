package ObjectOrientation.InnerClass;

class StaticOut {
    public static class StaticIn {
        public StaticIn(String msg) {
            System.out.println(msg);
        }
    }
}

public class CreateStaticInnerInstance {
    //在外部类以外创建静态内部类与非静态内部类不同,无需通过外部类实例访问构造器,因其为外部类类相关

    public static void main(String[] args) {

        StaticOut.StaticIn staticIn = new StaticOut.StaticIn("haha ");
    }

}
