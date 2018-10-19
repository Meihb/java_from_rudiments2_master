package ObjectOrientation.InnerClass;

/**
 * java中 statci只有一种情况下可以修饰class,即内部类
 * 非静态内部类中不可以有静态修饰语句,包括静态初始化块！
 * 思考:
 * 内部类与外部类不同的是加载方式,外部类加载时不会连带内部内一起加载,因此若非静态内部类中包含静态修饰语句,则会出现未加载而存储静态成员的矛盾
 */
public class Cow {
    private double weight;

    //外部类的两个构造器
    public Cow() {
    }

    public Cow(double weight) {
        this.weight = weight;
    }

    //定义一个非静态内部类
    private class CowLeg {
        //非静态内部类 两个实例变量
        private double length;
        private String color;

        //非静态内部类两个重载的构造器

        public CowLeg() {
        }

        public CowLeg(double length, String color) {
            this.length = length;
            this.color = color;
        }

        //非静态内部类的实例方法
        public void test() {
            //内部类访问外部类的成员变量时,可以使用 外部变量名+this作为访问符号
            System.out.println("当前牛腿颜色是:" + this.color + ",高度:" + Cow.this.weight);
        }
    }

    public void test() {
        CowLeg cowLeg = new CowLeg(1.12, "黑白相间");
        cowLeg.test();
    }

    public static void main(String[] args) {
        Cow cow = new Cow(378.9);
        cow.test();
    }
}
