package ObjectOrientation.Initilizer;

class Root {
    static {
        System.out.println("Root的静态初始化块");
    }

    {
        System.out.println("Root的普通初始化块");
    }

    public Root() {
        System.out.println("Root的无参构造器");
    }
}

class Mid extends Root {
    static {
        System.out.println("Mid 的静态初始化块");
    }

    {
        System.out.println("Mid 的普通初始化块");
    }

    public Mid() {
        System.out.println("Mid 的无参构造器");
    }

    public Mid(String msg) {
        //通过this调用同一类中重载的构造器
        this();
        System.out.println("Mid 的带参构造器,参数为" + msg);
    }
}

class Leaf extends Mid {
    static {
        System.out.println("Leaf的静态初始化块");
    }

    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf() {
        //调用父类带参构造器
        super("Java讲义");
        System.out.println("Leaf的无参构造器");
    }
}

public class StaticTest {
    static public void main(String[] args) {
        new Leaf();

        System.out.println("-------------------");
        new Leaf();
    }
}
