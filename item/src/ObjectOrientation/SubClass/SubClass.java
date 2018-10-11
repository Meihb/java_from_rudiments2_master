package ObjectOrientation.SubClass;

/**
 * 记得 变量跟左走,方法和右走
 */
class BaseClass {
    public int book = 6;

    public void base() {
        System.out.println("父类的普通方法");
    }

    public void test() {
        System.out.println("父类被覆盖的方法");
    }
}

public class SubClass extends BaseClass {
    //重新定义一个实例变量隐藏父类的实例变量
    public int book = 66;

    public void test() {
        System.out.println("子类覆盖的父类方法");
    }

    public void sub() {
        System.out.println("子类自身的方法");
    }

    public static void main(String[] args) {
        //下面 编译时类型和 运行时类型一致,不体现多态
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();

        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.sub();

        //以下 多态产生,编译时类型和运行时类型不一致
        BaseClass polymorphism = new SubClass();
        //尽管polymorphism实例中确有此方法,但JAVA编译时对方法的文法判断基于 其申明的类型
//        polymorphism.sub();
        System.out.println(polymorphism.getClass());
        //执行方法时却不同于文法判断,使用其实例的方法
        polymorphism.test();
        //与方法不同,实例变量的获取却用的其 编译类型所属的变量值
        System.out.println(polymorphism.book);
        System.out.println(((SubClass)polymorphism).book);
    }
}
