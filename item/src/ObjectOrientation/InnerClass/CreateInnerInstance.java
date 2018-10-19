package ObjectOrientation.InnerClass;

class Out {
    //定义外部类,使用默认访问控制
    //只有同一个包中的类可以访问
    class In {
        public In(String msg) {
            System.out.println(msg);
        }
    }
}

public class CreateInnerInstance {

    public static void main(String args[]) {
        Out.In in = new Out().new In("我来了");//记住文法

        Out.In in1;
        Out out = new Out();
        in1 = out.new In("这是第二个");
    }
}
