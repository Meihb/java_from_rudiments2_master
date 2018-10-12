package ObjectOrientation.Initilizer;


/**
 * java创建对象,自类被加载以后,先为实例变量分配内存(即处理申明类型),(以下为实例变量,按个人理解,似 静态初始化块和静态变量申明为先)
 * 其次初始化变量(其中变量申明时初试操作和 初始化块同权重,按照代码先手顺序依次执行)
 * 其次构造器
 */
class Initializer {
//    public static int Sw =12;
    /**
     * 普通初始化块对 对象初始化,静态初始化块对 类 初始化，切回溯源到所有父类静态初始化块直至java.lang.Object
     */
    static {
        Sw = 123;
    }

    {
        //初始化块
        a = 6;
    }

    public int a = 9;
    public static int Sw =12;

    public Initializer() {
        System.out.println("执行构造方法");
    }
}

/**
 * 初始化块 代码理解
 */
public class InitializerTest {

    public static void main(String[] args) {
        System.out.println(new Initializer().a);
        System.out.println(Initializer.Sw);
    }
}
